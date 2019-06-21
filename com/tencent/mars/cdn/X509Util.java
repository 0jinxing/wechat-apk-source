package com.tencent.mars.cdn;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build.VERSION;
import android.util.Pair;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public class X509Util
{
  private static final char[] HEX_DIGITS;
  private static final String OID_ANY_EKU = "2.5.29.37.0";
  private static final String OID_SERVER_GATED_MICROSOFT = "1.3.6.1.4.1.311.10.3.3";
  private static final String OID_SERVER_GATED_NETSCAPE = "2.16.840.1.113730.4.1";
  private static final String OID_TLS_SERVER_AUTH = "1.3.6.1.5.5.7.3.1";
  public static final int STATE_APPBRAND = 1;
  public static final int STATE_CDN = 0;
  private static final String TAG = "X509Util";
  private static CertificateFactory sCertificateFactory;
  private static X509Util.X509TrustManagerImplementation sDefaultTrustManager;
  private static boolean sLoadedSystemKeyStore;
  private static final Object sLock;
  private static File sSystemCertificateDirectory;
  private static KeyStore sSystemKeyStore;
  private static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
  private static KeyStore sTestKeyStore;
  private static X509Util.X509TrustManagerImplementation sTestTrustManager;
  private static X509Util.TrustStorageListener sTrustStorageListener;

  static
  {
    if (!X509Util.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      sLock = new Object();
      HEX_DIGITS = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
      return;
    }
  }

  public static void addTestRootCertificate(byte[] arg0)
  {
    ensureInitialized();
    X509Certificate localX509Certificate = createCertificateFromBytes(???);
    synchronized (sLock)
    {
      KeyStore localKeyStore = sTestKeyStore;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("root_cert_");
      localKeyStore.setCertificateEntry(Integer.toString(sTestKeyStore.size()), localX509Certificate);
      reloadTestTrustManager();
      return;
    }
  }

  public static void clearTestRootCertificates()
  {
    ensureInitialized();
    try
    {
      synchronized (sLock)
      {
        sTestKeyStore.load(null);
        reloadTestTrustManager();
        label19: return;
      }
    }
    catch (IOException localIOException)
    {
      break label19;
    }
  }

  public static X509Certificate createCertificateFromBytes(byte[] paramArrayOfByte)
  {
    ensureInitialized();
    return (X509Certificate)sCertificateFactory.generateCertificate(new ByteArrayInputStream(paramArrayOfByte));
  }

  private static X509Util.X509TrustManagerImplementation createTrustManager(KeyStore paramKeyStore)
  {
    Object localObject = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    ((TrustManagerFactory)localObject).init(paramKeyStore);
    localObject = ((TrustManagerFactory)localObject).getTrustManagers();
    int i = localObject.length;
    int j = 0;
    String str;
    if (j < i)
    {
      str = localObject[j];
      if (!(str instanceof X509TrustManager));
    }
    while (true)
    {
      try
      {
        if (Build.VERSION.SDK_INT >= 17)
        {
          paramKeyStore = new X509TrustManagerJellyBean((X509TrustManager)str);
          return paramKeyStore;
        }
        paramKeyStore = new X509Util.X509TrustManagerIceCreamSandwich((X509TrustManager)str);
        continue;
      }
      catch (IllegalArgumentException paramKeyStore)
      {
        str = str.getClass().getName();
        ab.e("X509Util", "Error creating trust manager (" + str + "): " + paramKeyStore);
      }
      j++;
      break;
      ab.e("X509Util", "Could not find suitable trust manager");
      paramKeyStore = null;
    }
  }

  private static void ensureInitialized()
  {
    synchronized (sLock)
    {
      ensureInitializedLocked();
      return;
    }
  }

  private static void ensureInitializedLocked()
  {
    assert (Thread.holdsLock(sLock));
    if (sCertificateFactory == null)
      sCertificateFactory = CertificateFactory.getInstance("X.509");
    if (sDefaultTrustManager == null)
      sDefaultTrustManager = createTrustManager(null);
    if (!sLoadedSystemKeyStore);
    try
    {
      sSystemKeyStore = KeyStore.getInstance("AndroidCAStore");
    }
    catch (KeyStoreException localKeyStoreException)
    {
      try
      {
        sSystemKeyStore.load(null);
        label71: Object localObject = new java/io/File;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        ((File)localObject).<init>(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
        sSystemCertificateDirectory = (File)localObject;
        while (true)
        {
          sLoadedSystemKeyStore = true;
          if (sSystemTrustAnchorCache == null)
            sSystemTrustAnchorCache = new HashSet();
          if (sTestKeyStore == null)
            sTestKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
          try
          {
            sTestKeyStore.load(null);
            label151: if (sTestTrustManager == null)
              sTestTrustManager = createTrustManager(sTestKeyStore);
            if (sTrustStorageListener == null)
            {
              sTrustStorageListener = new X509Util.TrustStorageListener(null);
              localObject = new IntentFilter();
              if (Build.VERSION.SDK_INT < 26)
                break label232;
              ((IntentFilter)localObject).addAction("android.security.action.KEYCHAIN_CHANGED");
              ((IntentFilter)localObject).addAction("android.security.action.KEY_ACCESS_CHANGED");
              ((IntentFilter)localObject).addAction("android.security.action.TRUST_STORE_CHANGED");
            }
            while (true)
            {
              ah.getContext().registerReceiver(sTrustStorageListener, (IntentFilter)localObject);
              return;
              label232: ((IntentFilter)localObject).addAction("android.security.STORAGE_CHANGED");
            }
          }
          catch (IOException localIOException1)
          {
            break label151;
          }
          localKeyStoreException = localKeyStoreException;
        }
      }
      catch (IOException localIOException2)
      {
        break label71;
      }
    }
  }

  private static List<String> getSubjectAlternativeNames(X509Certificate paramX509Certificate)
  {
    Object localObject1 = paramX509Certificate.getSubjectAlternativeNames();
    if (localObject1 == null);
    ArrayList localArrayList;
    for (paramX509Certificate = new ArrayList(); ; paramX509Certificate = localArrayList)
    {
      return paramX509Certificate;
      localArrayList = new ArrayList();
      Object localObject2 = ((Collection)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = ((List)((Iterator)localObject2).next()).get(1);
        if ((localObject1 instanceof String))
          localArrayList.add(((String)localObject1).toLowerCase());
      }
      localObject2 = paramX509Certificate.getSubjectDN().getName().trim();
      int i = ((String)localObject2).indexOf("CN=");
      paramX509Certificate = "";
      if (i >= 0)
      {
        localObject1 = ((String)localObject2).substring(i + 3);
        i = ((String)localObject1).indexOf(",");
        paramX509Certificate = (X509Certificate)localObject1;
        if (i > 0)
          paramX509Certificate = ((String)localObject1).substring(0, i);
      }
      ab.i("X509Util", "certificate dn %s cn %s", new Object[] { localObject2, paramX509Certificate });
      if (paramX509Certificate.length() > 0)
        localArrayList.add(paramX509Certificate);
    }
  }

  private static String hashPrincipal(X500Principal paramX500Principal)
  {
    byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramX500Principal.getEncoded());
    paramX500Principal = new char[8];
    for (int i = 0; i < 4; i++)
    {
      paramX500Principal[(i * 2)] = ((char)HEX_DIGITS[(arrayOfByte[(3 - i)] >> 4 & 0xF)]);
      paramX500Principal[(i * 2 + 1)] = ((char)HEX_DIGITS[(arrayOfByte[(3 - i)] & 0xF)]);
    }
    return new String(paramX500Principal);
  }

  private static boolean isHostMatched(List<String> paramList, String paramString)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramList.contains(paramString))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      int i = paramString.indexOf(".");
      int j = paramString.lastIndexOf(".");
      while (true)
      {
        if ((i <= 0) || (i >= j))
          break label115;
        String str = "*" + paramString.substring(i);
        ab.i("X509Util", "try match nhost ".concat(String.valueOf(str)));
        bool2 = bool1;
        if (paramList.contains(str))
          break;
        i = paramString.indexOf(".", i + 1);
      }
      label115: bool2 = false;
    }
  }

  private static boolean isKnownRoot(X509Certificate paramX509Certificate)
  {
    boolean bool1 = false;
    assert (Thread.holdsLock(sLock));
    boolean bool2;
    if (sSystemKeyStore == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      Pair localPair = new Pair(paramX509Certificate.getSubjectX500Principal(), paramX509Certificate.getPublicKey());
      if (sSystemTrustAnchorCache.contains(localPair))
      {
        bool2 = true;
      }
      else
      {
        String str = hashPrincipal(paramX509Certificate.getSubjectX500Principal());
        int i = 0;
        Object localObject1 = str + '.' + i;
        bool2 = bool1;
        if (new File(sSystemCertificateDirectory, (String)localObject1).exists())
        {
          Object localObject2 = sSystemKeyStore.getCertificate("system:".concat(String.valueOf(localObject1)));
          if (localObject2 != null)
          {
            if ((localObject2 instanceof X509Certificate))
              break label209;
            localObject2 = localObject2.getClass().getName();
            ab.e("X509Util", "Anchor " + (String)localObject1 + " not an X509Certificate: " + (String)localObject2);
          }
          label209: 
          do
          {
            i++;
            break;
            localObject1 = (X509Certificate)localObject2;
          }
          while ((!paramX509Certificate.getSubjectX500Principal().equals(((X509Certificate)localObject1).getSubjectX500Principal())) || (!paramX509Certificate.getPublicKey().equals(((X509Certificate)localObject1).getPublicKey())));
          sSystemTrustAnchorCache.add(localPair);
          bool2 = true;
        }
      }
    }
  }

  private static void reloadDefaultTrustManager()
  {
    synchronized (sLock)
    {
      sDefaultTrustManager = null;
      sSystemTrustAnchorCache = null;
      ensureInitializedLocked();
      return;
    }
  }

  private static void reloadTestTrustManager()
  {
    assert (Thread.holdsLock(sLock));
    sTestTrustManager = createTrustManager(sTestKeyStore);
  }

  static boolean verifyKeyUsage(X509Certificate paramX509Certificate)
  {
    try
    {
      paramX509Certificate = paramX509Certificate.getExtendedKeyUsage();
      if (paramX509Certificate == null)
      {
        bool = true;
        return bool;
      }
    }
    catch (NullPointerException paramX509Certificate)
    {
      while (true)
      {
        boolean bool = false;
        continue;
        paramX509Certificate = paramX509Certificate.iterator();
        while (true)
          if (paramX509Certificate.hasNext())
          {
            String str = (String)paramX509Certificate.next();
            if ((str.equals("1.3.6.1.5.5.7.3.1")) || (str.equals("2.5.29.37.0")) || (str.equals("2.16.840.1.113730.4.1")) || (str.equals("1.3.6.1.4.1.311.10.3.3")))
            {
              bool = true;
              break;
            }
          }
        bool = false;
      }
    }
  }

  public static AndroidCertVerifyResult verifyServerCertificates(byte[][] paramArrayOfByte, String paramString1, String paramString2)
  {
    return verifyServerCertificates(paramArrayOfByte, paramString1, paramString2, 0, null);
  }

  // ERROR //
  public static AndroidCertVerifyResult verifyServerCertificates(byte[][] paramArrayOfByte, String paramString1, String paramString2, int paramInt, X509TrustManager paramX509TrustManager)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 6
    //   6: ldc 41
    //   8: ldc_w 499
    //   11: iconst_2
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: aload_2
    //   18: aastore
    //   19: dup
    //   20: iconst_1
    //   21: aload_1
    //   22: aastore
    //   23: invokestatic 374	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aload_0
    //   27: ifnull +14 -> 41
    //   30: aload_0
    //   31: arraylength
    //   32: ifeq +9 -> 41
    //   35: aload_0
    //   36: iconst_0
    //   37: aaload
    //   38: ifnonnull +31 -> 69
    //   41: new 166	java/lang/IllegalArgumentException
    //   44: dup
    //   45: new 110	java/lang/StringBuilder
    //   48: dup
    //   49: ldc_w 501
    //   52: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   55: aload_0
    //   56: invokestatic 507	java/util/Arrays:deepToString	([Ljava/lang/Object;)Ljava/lang/String;
    //   59: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokespecial 508	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   68: athrow
    //   69: invokestatic 102	com/tencent/mars/cdn/X509Util:ensureInitialized	()V
    //   72: new 312	java/util/ArrayList
    //   75: dup
    //   76: invokespecial 313	java/util/ArrayList:<init>	()V
    //   79: astore 7
    //   81: aload 7
    //   83: aload_0
    //   84: iconst_0
    //   85: aaload
    //   86: invokestatic 106	com/tencent/mars/cdn/X509Util:createCertificateFromBytes	([B)Ljava/security/cert/X509Certificate;
    //   89: invokeinterface 342 2 0
    //   94: pop
    //   95: aload 7
    //   97: iconst_0
    //   98: invokeinterface 334 2 0
    //   103: checkcast 162	java/security/cert/X509Certificate
    //   106: invokestatic 510	com/tencent/mars/cdn/X509Util:getSubjectAlternativeNames	(Ljava/security/cert/X509Certificate;)Ljava/util/List;
    //   109: astore 8
    //   111: ldc 41
    //   113: ldc_w 512
    //   116: iconst_2
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_2
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: aload 8
    //   128: invokevirtual 513	java/lang/Object:toString	()Ljava/lang/String;
    //   131: aastore
    //   132: invokestatic 374	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: aload 8
    //   137: aload_2
    //   138: invokestatic 515	com/tencent/mars/cdn/X509Util:isHostMatched	(Ljava/util/List;Ljava/lang/String;)Z
    //   141: ifne +526 -> 667
    //   144: ldc 41
    //   146: ldc_w 517
    //   149: invokestatic 214	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   152: iload_3
    //   153: iconst_1
    //   154: if_icmpeq +46 -> 200
    //   157: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   160: astore 8
    //   162: aload 8
    //   164: iconst_m1
    //   165: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   168: aload 8
    //   170: astore_0
    //   171: aload_0
    //   172: areturn
    //   173: astore_0
    //   174: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   177: dup
    //   178: iconst_m1
    //   179: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   182: astore_0
    //   183: goto -12 -> 171
    //   186: astore_0
    //   187: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   190: dup
    //   191: bipush 251
    //   193: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   196: astore_0
    //   197: goto -26 -> 171
    //   200: iconst_0
    //   201: istore 9
    //   203: iload 5
    //   205: istore_3
    //   206: iload_3
    //   207: aload_0
    //   208: arraylength
    //   209: if_icmpge +101 -> 310
    //   212: aload 7
    //   214: aload_0
    //   215: iload_3
    //   216: aaload
    //   217: invokestatic 106	com/tencent/mars/cdn/X509Util:createCertificateFromBytes	([B)Ljava/security/cert/X509Certificate;
    //   220: invokeinterface 342 2 0
    //   225: pop
    //   226: iinc 3 1
    //   229: goto -23 -> 206
    //   232: astore 8
    //   234: ldc 41
    //   236: new 110	java/lang/StringBuilder
    //   239: dup
    //   240: ldc_w 524
    //   243: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   246: aload 8
    //   248: invokevirtual 527	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   251: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokestatic 214	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: iload_3
    //   261: iconst_1
    //   262: if_icmpeq +396 -> 658
    //   265: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   268: dup
    //   269: iconst_m1
    //   270: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   273: astore_0
    //   274: goto -103 -> 171
    //   277: astore 8
    //   279: ldc 41
    //   281: new 110	java/lang/StringBuilder
    //   284: dup
    //   285: ldc_w 529
    //   288: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   291: iload_3
    //   292: invokevirtual 454	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   295: ldc_w 531
    //   298: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: invokestatic 534	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   307: goto -81 -> 226
    //   310: aload 7
    //   312: aload 7
    //   314: invokeinterface 535 1 0
    //   319: anewarray 162	java/security/cert/X509Certificate
    //   322: invokeinterface 539 2 0
    //   327: checkcast 541	[Ljava/security/cert/X509Certificate;
    //   330: astore 7
    //   332: aload 7
    //   334: iconst_0
    //   335: aaload
    //   336: invokevirtual 544	java/security/cert/X509Certificate:checkValidity	()V
    //   339: aload 7
    //   341: iconst_0
    //   342: aaload
    //   343: invokestatic 546	com/tencent/mars/cdn/X509Util:verifyKeyUsage	(Ljava/security/cert/X509Certificate;)Z
    //   346: ifne +57 -> 403
    //   349: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   352: astore_0
    //   353: aload_0
    //   354: bipush 250
    //   356: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   359: goto -188 -> 171
    //   362: astore_0
    //   363: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   366: dup
    //   367: bipush 253
    //   369: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   372: astore_0
    //   373: goto -202 -> 171
    //   376: astore_0
    //   377: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   380: dup
    //   381: bipush 252
    //   383: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   386: astore_0
    //   387: goto -216 -> 171
    //   390: astore_0
    //   391: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   394: dup
    //   395: iconst_m1
    //   396: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   399: astore_0
    //   400: goto -229 -> 171
    //   403: getstatic 74	com/tencent/mars/cdn/X509Util:sLock	Ljava/lang/Object;
    //   406: astore 8
    //   408: aload 8
    //   410: monitorenter
    //   411: getstatic 237	com/tencent/mars/cdn/X509Util:sDefaultTrustManager	Lcom/tencent/mars/cdn/X509Util$X509TrustManagerImplementation;
    //   414: ifnonnull +29 -> 443
    //   417: aload 4
    //   419: ifnonnull +24 -> 443
    //   422: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   425: astore_0
    //   426: aload_0
    //   427: iconst_m1
    //   428: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   431: aload 8
    //   433: monitorexit
    //   434: goto -263 -> 171
    //   437: astore_0
    //   438: aload 8
    //   440: monitorexit
    //   441: aload_0
    //   442: athrow
    //   443: aload 4
    //   445: ifnull +84 -> 529
    //   448: aload 4
    //   450: aload 7
    //   452: aload_1
    //   453: invokeinterface 550 3 0
    //   458: new 312	java/util/ArrayList
    //   461: astore_1
    //   462: aload_1
    //   463: invokespecial 313	java/util/ArrayList:<init>	()V
    //   466: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   469: astore_0
    //   470: aload_0
    //   471: iconst_0
    //   472: iconst_1
    //   473: aload_1
    //   474: iload 9
    //   476: invokespecial 553	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(IZLjava/util/List;Z)V
    //   479: aload 8
    //   481: monitorexit
    //   482: goto -311 -> 171
    //   485: astore_0
    //   486: new 110	java/lang/StringBuilder
    //   489: astore_1
    //   490: aload_1
    //   491: ldc_w 555
    //   494: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   497: ldc 41
    //   499: aload_1
    //   500: aload_0
    //   501: invokevirtual 558	java/security/cert/CertificateException:getMessage	()Ljava/lang/String;
    //   504: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   510: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   513: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   516: astore_0
    //   517: aload_0
    //   518: bipush 254
    //   520: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   523: aload 8
    //   525: monitorexit
    //   526: goto -355 -> 171
    //   529: getstatic 237	com/tencent/mars/cdn/X509Util:sDefaultTrustManager	Lcom/tencent/mars/cdn/X509Util$X509TrustManagerImplementation;
    //   532: aload 7
    //   534: aload_1
    //   535: aload_2
    //   536: invokeinterface 561 4 0
    //   541: astore_0
    //   542: aload_0
    //   543: invokeinterface 535 1 0
    //   548: ifle +25 -> 573
    //   551: aload_0
    //   552: aload_0
    //   553: invokeinterface 535 1 0
    //   558: iconst_1
    //   559: isub
    //   560: invokeinterface 334 2 0
    //   565: checkcast 162	java/security/cert/X509Certificate
    //   568: invokestatic 563	com/tencent/mars/cdn/X509Util:isKnownRoot	(Ljava/security/cert/X509Certificate;)Z
    //   571: istore 6
    //   573: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   576: astore_1
    //   577: aload_1
    //   578: iconst_0
    //   579: iload 6
    //   581: aload_0
    //   582: iload 9
    //   584: invokespecial 553	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(IZLjava/util/List;Z)V
    //   587: aload 8
    //   589: monitorexit
    //   590: aload_1
    //   591: astore_0
    //   592: goto -421 -> 171
    //   595: astore 4
    //   597: getstatic 274	com/tencent/mars/cdn/X509Util:sTestTrustManager	Lcom/tencent/mars/cdn/X509Util$X509TrustManagerImplementation;
    //   600: aload 7
    //   602: aload_1
    //   603: aload_2
    //   604: invokeinterface 561 4 0
    //   609: astore_0
    //   610: goto -68 -> 542
    //   613: astore_0
    //   614: new 110	java/lang/StringBuilder
    //   617: astore_0
    //   618: aload_0
    //   619: ldc_w 565
    //   622: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   625: ldc 41
    //   627: aload_0
    //   628: aload 4
    //   630: invokevirtual 558	java/security/cert/CertificateException:getMessage	()Ljava/lang/String;
    //   633: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   639: invokestatic 424	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   642: new 519	com/tencent/mars/cdn/AndroidCertVerifyResult
    //   645: astore_0
    //   646: aload_0
    //   647: bipush 254
    //   649: invokespecial 522	com/tencent/mars/cdn/AndroidCertVerifyResult:<init>	(I)V
    //   652: aload 8
    //   654: monitorexit
    //   655: goto -484 -> 171
    //   658: iconst_0
    //   659: istore 9
    //   661: iload 5
    //   663: istore_3
    //   664: goto -458 -> 206
    //   667: iconst_1
    //   668: istore 9
    //   670: goto -467 -> 203
    //
    // Exception table:
    //   from	to	target	type
    //   69	72	173	java/security/cert/CertificateException
    //   81	95	186	java/security/cert/CertificateException
    //   95	152	232	java/lang/Exception
    //   157	168	232	java/lang/Exception
    //   212	226	277	java/security/cert/CertificateException
    //   332	359	362	java/security/cert/CertificateExpiredException
    //   332	359	376	java/security/cert/CertificateNotYetValidException
    //   332	359	390	java/security/cert/CertificateException
    //   411	417	437	finally
    //   422	434	437	finally
    //   438	441	437	finally
    //   448	458	437	finally
    //   458	482	437	finally
    //   486	526	437	finally
    //   529	542	437	finally
    //   542	573	437	finally
    //   573	590	437	finally
    //   597	610	437	finally
    //   614	655	437	finally
    //   448	458	485	java/security/cert/CertificateException
    //   529	542	595	java/security/cert/CertificateException
    //   597	610	613	java/security/cert/CertificateException
  }

  public static AndroidCertVerifyResult verifyServerCertificates(byte[][] paramArrayOfByte, String paramString1, String paramString2, X509TrustManager paramX509TrustManager)
  {
    return verifyServerCertificates(paramArrayOfByte, paramString1, paramString2, 0, paramX509TrustManager);
  }

  public static final class CertVerifyStatusAndroid
  {
    public static final int EXPIRED = -3;
    public static final int FAILED = -1;
    public static final int INCORRECT_KEY_USAGE = -6;
    public static final int NOT_YET_VALID = -4;
    public static final int NO_TRUSTED_ROOT = -2;
    public static final int OK = 0;
    public static final int UNABLE_TO_PARSE = -5;
  }

  static final class X509TrustManagerJellyBean
    implements X509Util.X509TrustManagerImplementation
  {
    private final X509TrustManagerExtensions mTrustManagerExtensions;

    @SuppressLint({"NewApi"})
    public X509TrustManagerJellyBean(X509TrustManager paramX509TrustManager)
    {
      this.mTrustManagerExtensions = new X509TrustManagerExtensions(paramX509TrustManager);
    }

    @SuppressLint({"NewApi"})
    public final List<X509Certificate> checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString1, String paramString2)
    {
      return this.mTrustManagerExtensions.checkServerTrusted(paramArrayOfX509Certificate, paramString1, paramString2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.X509Util
 * JD-Core Version:    0.6.2
 */