package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

public final class zzka extends zzhh
{
  private static final String[] zzard = { "firebase_", "google_", "ga_" };
  private SecureRandom zzare;
  private final AtomicLong zzarf;
  private int zzarg;
  private Integer zzarh;

  zzka(zzgl paramzzgl)
  {
    super(paramzzgl);
    AppMethodBeat.i(69498);
    this.zzarh = null;
    this.zzarf = new AtomicLong(0L);
    AppMethodBeat.o(69498);
  }

  static MessageDigest getMessageDigest(String paramString)
  {
    AppMethodBeat.i(69531);
    int i = 0;
    if (i < 2);
    while (true)
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null)
        {
          AppMethodBeat.o(69531);
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
      break;
      Object localObject = null;
      AppMethodBeat.o(69531);
    }
  }

  public static zzko zza(zzkn paramzzkn, String paramString)
  {
    AppMethodBeat.i(69543);
    zzko[] arrayOfzzko = paramzzkn.zzata;
    int i = arrayOfzzko.length;
    int j = 0;
    if (j < i)
    {
      paramzzkn = arrayOfzzko[j];
      if (paramzzkn.name.equals(paramString))
        AppMethodBeat.o(69543);
    }
    while (true)
    {
      return paramzzkn;
      j++;
      break;
      paramzzkn = null;
      AppMethodBeat.o(69543);
    }
  }

  private static Object zza(int paramInt, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(69514);
    if (paramObject == null)
    {
      AppMethodBeat.o(69514);
      paramObject = null;
    }
    while (true)
    {
      return paramObject;
      if (((paramObject instanceof Long)) || ((paramObject instanceof Double)))
      {
        AppMethodBeat.o(69514);
      }
      else if ((paramObject instanceof Integer))
      {
        paramObject = Long.valueOf(((Integer)paramObject).intValue());
        AppMethodBeat.o(69514);
      }
      else if ((paramObject instanceof Byte))
      {
        paramObject = Long.valueOf(((Byte)paramObject).byteValue());
        AppMethodBeat.o(69514);
      }
      else if ((paramObject instanceof Short))
      {
        paramObject = Long.valueOf(((Short)paramObject).shortValue());
        AppMethodBeat.o(69514);
      }
      else
      {
        if ((paramObject instanceof Boolean))
        {
          if (((Boolean)paramObject).booleanValue());
          for (long l = 1L; ; l = 0L)
          {
            paramObject = Long.valueOf(l);
            AppMethodBeat.o(69514);
            break;
          }
        }
        if ((paramObject instanceof Float))
        {
          paramObject = Double.valueOf(((Float)paramObject).doubleValue());
          AppMethodBeat.o(69514);
        }
        else if (((paramObject instanceof String)) || ((paramObject instanceof Character)) || ((paramObject instanceof CharSequence)))
        {
          paramObject = zza(String.valueOf(paramObject), paramInt, paramBoolean);
          AppMethodBeat.o(69514);
        }
        else
        {
          AppMethodBeat.o(69514);
          paramObject = null;
        }
      }
    }
  }

  public static String zza(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(69515);
    if (paramString.codePointCount(0, paramString.length()) > paramInt)
      if (paramBoolean)
      {
        paramString = String.valueOf(paramString.substring(0, paramString.offsetByCodePoints(0, paramInt))).concat("...");
        AppMethodBeat.o(69515);
      }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(69515);
      continue;
      AppMethodBeat.o(69515);
    }
  }

  public static String zza(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(69554);
    Preconditions.checkNotNull(paramArrayOfString1);
    Preconditions.checkNotNull(paramArrayOfString2);
    int i = Math.min(paramArrayOfString1.length, paramArrayOfString2.length);
    int j = 0;
    if (j < i)
      if (zzs(paramString, paramArrayOfString1[j]))
      {
        paramString = paramArrayOfString2[j];
        AppMethodBeat.o(69554);
      }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(69554);
    }
  }

  private static void zza(Bundle paramBundle, Object paramObject)
  {
    AppMethodBeat.i(69520);
    Preconditions.checkNotNull(paramBundle);
    if ((paramObject != null) && (((paramObject instanceof String)) || ((paramObject instanceof CharSequence))))
      paramBundle.putLong("_el", String.valueOf(paramObject).length());
    AppMethodBeat.o(69520);
  }

  private static boolean zza(Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(69519);
    boolean bool;
    if (paramBundle.getLong("_err") == 0L)
    {
      paramBundle.putLong("_err", paramInt);
      bool = true;
      AppMethodBeat.o(69519);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69519);
    }
  }

  private final boolean zza(String paramString1, String paramString2, int paramInt, Object paramObject, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(69512);
    if (paramObject == null)
    {
      AppMethodBeat.o(69512);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (((paramObject instanceof Long)) || ((paramObject instanceof Float)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Boolean)) || ((paramObject instanceof Double)))
      {
        AppMethodBeat.o(69512);
        paramBoolean = bool;
      }
      else if (((paramObject instanceof String)) || ((paramObject instanceof Character)) || ((paramObject instanceof CharSequence)))
      {
        paramObject = String.valueOf(paramObject);
        if (paramObject.codePointCount(0, paramObject.length()) > paramInt)
        {
          zzge().zzip().zzd("Value is too long; discarded. Value kind, name, value length", paramString1, paramString2, Integer.valueOf(paramObject.length()));
          AppMethodBeat.o(69512);
          paramBoolean = false;
        }
        else
        {
          AppMethodBeat.o(69512);
          paramBoolean = bool;
        }
      }
      else if (((paramObject instanceof Bundle)) && (paramBoolean))
      {
        AppMethodBeat.o(69512);
        paramBoolean = bool;
      }
      else
      {
        int i;
        if (((paramObject instanceof Parcelable[])) && (paramBoolean))
        {
          paramObject = (Parcelable[])paramObject;
          i = paramObject.length;
          for (paramInt = 0; ; paramInt++)
          {
            if (paramInt >= i)
              break label288;
            paramString1 = paramObject[paramInt];
            if (!(paramString1 instanceof Bundle))
            {
              zzge().zzip().zze("All Parcelable[] elements must be of type Bundle. Value type, name", paramString1.getClass(), paramString2);
              AppMethodBeat.o(69512);
              paramBoolean = false;
              break;
            }
          }
          label288: AppMethodBeat.o(69512);
          paramBoolean = bool;
        }
        else if (((paramObject instanceof ArrayList)) && (paramBoolean))
        {
          paramString1 = (ArrayList)paramObject;
          i = paramString1.size();
          paramInt = 0;
          while (true)
            if (paramInt < i)
            {
              paramObject = paramString1.get(paramInt);
              paramInt++;
              if (!(paramObject instanceof Bundle))
              {
                zzge().zzip().zze("All ArrayList elements must be of type Bundle. Value type, name", paramObject.getClass(), paramString2);
                AppMethodBeat.o(69512);
                paramBoolean = false;
                break;
              }
            }
          AppMethodBeat.o(69512);
          paramBoolean = bool;
        }
        else
        {
          AppMethodBeat.o(69512);
          paramBoolean = false;
        }
      }
    }
  }

  public static boolean zza(long[] paramArrayOfLong, int paramInt)
  {
    boolean bool = false;
    if (paramInt >= paramArrayOfLong.length << 6);
    while (true)
    {
      return bool;
      if ((paramArrayOfLong[(paramInt / 64)] & 1L << paramInt % 64) != 0L)
        bool = true;
    }
  }

  static byte[] zza(Parcelable paramParcelable)
  {
    AppMethodBeat.i(69552);
    if (paramParcelable == null)
    {
      paramParcelable = null;
      AppMethodBeat.o(69552);
    }
    while (true)
    {
      return paramParcelable;
      Parcel localParcel = Parcel.obtain();
      try
      {
        paramParcelable.writeToParcel(localParcel, 0);
        paramParcelable = localParcel.marshall();
        localParcel.recycle();
        AppMethodBeat.o(69552);
      }
      finally
      {
        localParcel.recycle();
        AppMethodBeat.o(69552);
      }
    }
  }

  public static long[] zza(BitSet paramBitSet)
  {
    AppMethodBeat.i(69539);
    int i = (paramBitSet.length() + 63) / 64;
    long[] arrayOfLong = new long[i];
    for (int j = 0; j < i; j++)
    {
      arrayOfLong[j] = 0L;
      for (int k = 0; (k < 64) && ((j << 6) + k < paramBitSet.length()); k++)
        if (paramBitSet.get((j << 6) + k))
          arrayOfLong[j] |= 1L << k;
    }
    AppMethodBeat.o(69539);
    return arrayOfLong;
  }

  static zzko[] zza(zzko[] paramArrayOfzzko, String paramString, Object paramObject)
  {
    AppMethodBeat.i(69545);
    int i = paramArrayOfzzko.length;
    for (int j = 0; j < i; j++)
    {
      localObject = paramArrayOfzzko[j];
      if (paramString.equals(((zzko)localObject).name))
      {
        ((zzko)localObject).zzate = null;
        ((zzko)localObject).zzajf = null;
        ((zzko)localObject).zzarc = null;
        if ((paramObject instanceof Long))
          ((zzko)localObject).zzate = ((Long)paramObject);
        while (true)
        {
          AppMethodBeat.o(69545);
          return paramArrayOfzzko;
          if ((paramObject instanceof String))
            ((zzko)localObject).zzajf = ((String)paramObject);
          else if ((paramObject instanceof Double))
            ((zzko)localObject).zzarc = ((Double)paramObject);
        }
      }
    }
    Object localObject = new zzko[paramArrayOfzzko.length + 1];
    System.arraycopy(paramArrayOfzzko, 0, localObject, 0, paramArrayOfzzko.length);
    zzko localzzko = new zzko();
    localzzko.name = paramString;
    if ((paramObject instanceof Long))
      localzzko.zzate = ((Long)paramObject);
    while (true)
    {
      localObject[paramArrayOfzzko.length] = localzzko;
      AppMethodBeat.o(69545);
      paramArrayOfzzko = (zzko[])localObject;
      break;
      if ((paramObject instanceof String))
        localzzko.zzajf = ((String)paramObject);
      else if ((paramObject instanceof Double))
        localzzko.zzarc = ((Double)paramObject);
    }
  }

  public static Object zzb(zzkn paramzzkn, String paramString)
  {
    AppMethodBeat.i(69544);
    paramzzkn = zza(paramzzkn, paramString);
    if (paramzzkn != null)
      if (paramzzkn.zzajf != null)
      {
        paramzzkn = paramzzkn.zzajf;
        AppMethodBeat.o(69544);
      }
    while (true)
    {
      return paramzzkn;
      if (paramzzkn.zzate != null)
      {
        paramzzkn = paramzzkn.zzate;
        AppMethodBeat.o(69544);
      }
      else if (paramzzkn.zzarc != null)
      {
        paramzzkn = paramzzkn.zzarc;
        AppMethodBeat.o(69544);
      }
      else
      {
        paramzzkn = null;
        AppMethodBeat.o(69544);
      }
    }
  }

  @VisibleForTesting
  static long zzc(byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(69532);
    Preconditions.checkNotNull(paramArrayOfByte);
    if (paramArrayOfByte.length > 0);
    long l;
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool);
      l = 0L;
      for (int j = paramArrayOfByte.length - 1; (j >= 0) && (j >= paramArrayOfByte.length - 8); j--)
      {
        l += ((paramArrayOfByte[j] & 0xFF) << i);
        i += 8;
      }
    }
    AppMethodBeat.o(69532);
    return l;
  }

  public static boolean zzc(Context paramContext, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(69535);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager == null)
        AppMethodBeat.o(69535);
      while (true)
      {
        return bool1;
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, paramString);
        paramContext = localPackageManager.getServiceInfo(localComponentName, 0);
        if (paramContext == null)
          break;
        boolean bool2 = paramContext.enabled;
        if (!bool2)
          break;
        bool1 = true;
        AppMethodBeat.o(69535);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
        AppMethodBeat.o(69535);
    }
  }

  static boolean zzcc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(69502);
    Preconditions.checkNotEmpty(paramString);
    if ((paramString.charAt(0) != '_') || (paramString.equals("_ep")))
    {
      bool = true;
      AppMethodBeat.o(69502);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(69502);
    }
  }

  private static int zzch(String paramString)
  {
    AppMethodBeat.i(69521);
    int i;
    if ("_ldl".equals(paramString))
    {
      i = 2048;
      AppMethodBeat.o(69521);
    }
    while (true)
    {
      return i;
      if ("_id".equals(paramString))
      {
        i = 256;
        AppMethodBeat.o(69521);
      }
      else
      {
        i = 36;
        AppMethodBeat.o(69521);
      }
    }
  }

  public static boolean zzci(String paramString)
  {
    AppMethodBeat.i(69537);
    boolean bool;
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("_")))
    {
      bool = true;
      AppMethodBeat.o(69537);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69537);
    }
  }

  static boolean zzck(String paramString)
  {
    AppMethodBeat.i(69541);
    boolean bool;
    if ((paramString != null) && (paramString.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) && (paramString.length() <= 310))
    {
      bool = true;
      AppMethodBeat.o(69541);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69541);
    }
  }

  static boolean zzcl(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(69550);
    Preconditions.checkNotEmpty(paramString);
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        AppMethodBeat.o(69550);
        bool = false;
      case 0:
      case 1:
      case 2:
      }
      break;
    case 94660:
    case 95027:
    case 95025:
    }
    while (true)
    {
      return bool;
      if (!paramString.equals("_in"))
        break;
      i = 0;
      break;
      if (!paramString.equals("_ui"))
        break;
      i = 1;
      break;
      if (!paramString.equals("_ug"))
        break;
      i = 2;
      break;
      AppMethodBeat.o(69550);
    }
  }

  public static boolean zzd(Intent paramIntent)
  {
    AppMethodBeat.i(69504);
    paramIntent = paramIntent.getStringExtra("android.intent.extra.REFERRER_NAME");
    boolean bool;
    if (("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(paramIntent)) || ("https://www.google.com".equals(paramIntent)) || ("android-app://com.google.appcrawler".equals(paramIntent)))
    {
      bool = true;
      AppMethodBeat.o(69504);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(69504);
    }
  }

  static boolean zzd(zzeu paramzzeu, zzdz paramzzdz)
  {
    AppMethodBeat.i(69549);
    Preconditions.checkNotNull(paramzzeu);
    Preconditions.checkNotNull(paramzzdz);
    boolean bool;
    if (TextUtils.isEmpty(paramzzdz.zzadm))
    {
      bool = false;
      AppMethodBeat.o(69549);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(69549);
    }
  }

  @VisibleForTesting
  private final boolean zze(Context paramContext, String paramString)
  {
    AppMethodBeat.i(69548);
    X500Principal localX500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
    try
    {
      paramContext = Wrappers.packageManager(paramContext).getPackageInfo(paramString, 64);
      if ((paramContext != null) && (paramContext.signatures != null) && (paramContext.signatures.length > 0))
      {
        paramString = paramContext.signatures[0];
        paramContext = CertificateFactory.getInstance("X.509");
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(paramString.toByteArray());
        bool = ((X509Certificate)paramContext.generateCertificate(localByteArrayInputStream)).getSubjectX500Principal().equals(localX500Principal);
        AppMethodBeat.o(69548);
        return bool;
      }
    }
    catch (CertificateException paramContext)
    {
      while (true)
      {
        zzge().zzim().zzg("Error obtaining certificate", paramContext);
        boolean bool = true;
        AppMethodBeat.o(69548);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
        zzge().zzim().zzg("Package name not found", paramContext);
    }
  }

  public static Bundle[] zze(Object paramObject)
  {
    AppMethodBeat.i(69517);
    if ((paramObject instanceof Bundle))
    {
      Bundle[] arrayOfBundle = new Bundle[1];
      arrayOfBundle[0] = ((Bundle)paramObject);
      AppMethodBeat.o(69517);
      paramObject = arrayOfBundle;
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Parcelable[]))
      {
        paramObject = (Bundle[])Arrays.copyOf((Parcelable[])paramObject, ((Parcelable[])paramObject).length, [Landroid.os.Bundle.class);
        AppMethodBeat.o(69517);
      }
      else if ((paramObject instanceof ArrayList))
      {
        paramObject = (ArrayList)paramObject;
        paramObject = (Bundle[])paramObject.toArray(new Bundle[paramObject.size()]);
        AppMethodBeat.o(69517);
      }
      else
      {
        paramObject = null;
        AppMethodBeat.o(69517);
      }
    }
  }

  // ERROR //
  public static Object zzf(Object paramObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 491
    //   5: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +13 -> 22
    //   12: ldc_w 491
    //   15: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_1
    //   19: astore_0
    //   20: aload_0
    //   21: areturn
    //   22: new 493	java/io/ByteArrayOutputStream
    //   25: astore_2
    //   26: aload_2
    //   27: invokespecial 494	java/io/ByteArrayOutputStream:<init>	()V
    //   30: new 496	java/io/ObjectOutputStream
    //   33: astore_3
    //   34: aload_3
    //   35: aload_2
    //   36: invokespecial 499	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   39: aload_3
    //   40: aload_0
    //   41: invokevirtual 503	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   44: aload_3
    //   45: invokevirtual 506	java/io/ObjectOutputStream:flush	()V
    //   48: new 508	java/io/ObjectInputStream
    //   51: astore 4
    //   53: new 441	java/io/ByteArrayInputStream
    //   56: astore_0
    //   57: aload_0
    //   58: aload_2
    //   59: invokevirtual 509	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   62: invokespecial 449	java/io/ByteArrayInputStream:<init>	([B)V
    //   65: aload 4
    //   67: aload_0
    //   68: invokespecial 512	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   71: aload 4
    //   73: invokevirtual 516	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   76: astore_0
    //   77: aload_3
    //   78: invokevirtual 519	java/io/ObjectOutputStream:close	()V
    //   81: aload 4
    //   83: invokevirtual 520	java/io/ObjectInputStream:close	()V
    //   86: ldc_w 491
    //   89: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: goto -72 -> 20
    //   95: astore_0
    //   96: aconst_null
    //   97: astore 4
    //   99: aconst_null
    //   100: astore_3
    //   101: aload_3
    //   102: ifnull +7 -> 109
    //   105: aload_3
    //   106: invokevirtual 519	java/io/ObjectOutputStream:close	()V
    //   109: aload 4
    //   111: ifnull +8 -> 119
    //   114: aload 4
    //   116: invokevirtual 520	java/io/ObjectInputStream:close	()V
    //   119: ldc_w 491
    //   122: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aload_0
    //   126: athrow
    //   127: astore_0
    //   128: ldc_w 491
    //   131: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   134: aload_1
    //   135: astore_0
    //   136: goto -116 -> 20
    //   139: astore_0
    //   140: goto -12 -> 128
    //   143: astore_0
    //   144: aconst_null
    //   145: astore 4
    //   147: goto -46 -> 101
    //   150: astore_0
    //   151: goto -50 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   22	39	95	finally
    //   77	86	127	java/io/IOException
    //   105	109	127	java/io/IOException
    //   114	119	127	java/io/IOException
    //   119	127	127	java/io/IOException
    //   77	86	139	java/lang/ClassNotFoundException
    //   105	109	139	java/lang/ClassNotFoundException
    //   114	119	139	java/lang/ClassNotFoundException
    //   119	127	139	java/lang/ClassNotFoundException
    //   39	71	143	finally
    //   71	77	150	finally
  }

  private final boolean zzr(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(69506);
    if (paramString2 == null)
    {
      zzge().zzim().zzg("Name is required and can't be null. Type", paramString1);
      AppMethodBeat.o(69506);
    }
    while (true)
    {
      return bool;
      if (paramString2.length() == 0)
      {
        zzge().zzim().zzg("Name is required and can't be empty. Type", paramString1);
        AppMethodBeat.o(69506);
      }
      else
      {
        int i = paramString2.codePointAt(0);
        if ((!Character.isLetter(i)) && (i != 95))
        {
          zzge().zzim().zze("Name must start with a letter or _ (underscore). Type, name", paramString1, paramString2);
          AppMethodBeat.o(69506);
        }
        else
        {
          int j = paramString2.length();
          i = Character.charCount(i);
          while (true)
          {
            if (i >= j)
              break label190;
            int k = paramString2.codePointAt(i);
            if ((k != 95) && (!Character.isLetterOrDigit(k)))
            {
              zzge().zzim().zze("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
              AppMethodBeat.o(69506);
              break;
            }
            i += Character.charCount(k);
          }
          label190: bool = true;
          AppMethodBeat.o(69506);
        }
      }
    }
  }

  public static boolean zzs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(69538);
    boolean bool;
    if ((paramString1 == null) && (paramString2 == null))
    {
      bool = true;
      AppMethodBeat.o(69538);
    }
    while (true)
    {
      return bool;
      if (paramString1 == null)
      {
        bool = false;
        AppMethodBeat.o(69538);
      }
      else
      {
        bool = paramString1.equals(paramString2);
        AppMethodBeat.o(69538);
      }
    }
  }

  public final Bundle zza(Uri paramUri)
  {
    Bundle localBundle = null;
    AppMethodBeat.i(69503);
    if (paramUri == null)
    {
      AppMethodBeat.o(69503);
      paramUri = localBundle;
      return paramUri;
    }
    while (true)
    {
      try
      {
        if (!paramUri.isHierarchical())
          break label344;
        str1 = paramUri.getQueryParameter("utm_campaign");
        str2 = paramUri.getQueryParameter("utm_source");
        str3 = paramUri.getQueryParameter("utm_medium");
        str4 = paramUri.getQueryParameter("gclid");
        if ((TextUtils.isEmpty(str1)) && (TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3)) && (TextUtils.isEmpty(str4)))
          break label333;
        localBundle = new Bundle();
        if (!TextUtils.isEmpty(str1))
          localBundle.putString("campaign", str1);
        if (!TextUtils.isEmpty(str2))
          localBundle.putString("source", str2);
        if (!TextUtils.isEmpty(str3))
          localBundle.putString("medium", str3);
        if (!TextUtils.isEmpty(str4))
          localBundle.putString("gclid", str4);
        str3 = paramUri.getQueryParameter("utm_term");
        if (!TextUtils.isEmpty(str3))
          localBundle.putString("term", str3);
        str3 = paramUri.getQueryParameter("utm_content");
        if (!TextUtils.isEmpty(str3))
          localBundle.putString("content", str3);
        str3 = paramUri.getQueryParameter("aclid");
        if (!TextUtils.isEmpty(str3))
          localBundle.putString("aclid", str3);
        str3 = paramUri.getQueryParameter("cp1");
        if (!TextUtils.isEmpty(str3))
          localBundle.putString("cp1", str3);
        paramUri = paramUri.getQueryParameter("anid");
        if (!TextUtils.isEmpty(paramUri))
          localBundle.putString("anid", paramUri);
        AppMethodBeat.o(69503);
        paramUri = localBundle;
      }
      catch (UnsupportedOperationException paramUri)
      {
        zzge().zzip().zzg("Install referrer url isn't a hierarchical URI", paramUri);
        AppMethodBeat.o(69503);
        paramUri = localBundle;
      }
      break;
      label333: AppMethodBeat.o(69503);
      paramUri = localBundle;
      break;
      label344: String str4 = null;
      String str3 = null;
      String str2 = null;
      String str1 = null;
    }
  }

  public final Bundle zza(String paramString, Bundle paramBundle, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(69518);
    Bundle localBundle = null;
    if (paramBundle != null)
    {
      localBundle = new Bundle(paramBundle);
      Iterator localIterator = paramBundle.keySet().iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        int j = 0;
        int k = 0;
        if ((paramList == null) || (!paramList.contains(str)))
        {
          if (paramBoolean1)
          {
            if (zzq("event param", str))
              break label178;
            k = 3;
          }
          label100: j = k;
          if (k == 0)
          {
            if (zzr("event param", str))
              break label224;
            j = 3;
          }
        }
        while (true)
        {
          if (j == 0)
            break label270;
          if (zza(localBundle, j))
          {
            localBundle.putString("_ev", zza(str, 40, true));
            if (j == 3)
              zza(localBundle, str);
          }
          localBundle.remove(str);
          break;
          label178: if (!zza("event param", null, str))
          {
            k = 14;
            break label100;
          }
          if (!zza("event param", 40, str))
          {
            k = 3;
            break label100;
          }
          k = 0;
          break label100;
          label224: if (!zza("event param", null, str))
            j = 14;
          else if (!zza("event param", 40, str))
            j = 3;
          else
            j = 0;
        }
        label270: Object localObject = paramBundle.get(str);
        zzab();
        if (paramBoolean2)
          if ((localObject instanceof Parcelable[]))
          {
            j = ((Parcelable[])localObject).length;
            label303: if (j <= 1000)
              break label436;
            zzge().zzip().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str, Integer.valueOf(j));
            j = 0;
            label337: if (j != 0)
              break label442;
            j = 17;
          }
        while (true)
        {
          if ((j == 0) || ("_ev".equals(str)))
            break label529;
          if (zza(localBundle, j))
          {
            localBundle.putString("_ev", zza(str, 40, true));
            zza(localBundle, paramBundle.get(str));
          }
          localBundle.remove(str);
          break;
          if ((localObject instanceof ArrayList))
          {
            j = ((ArrayList)localObject).size();
            break label303;
          }
          j = 1;
          break label337;
          label436: j = 1;
          break label337;
          label442: if (((zzgg().zzaw(zzfv().zzah())) && (zzci(paramString))) || (zzci(str)));
          for (boolean bool = zza("param", str, 256, localObject, paramBoolean2); ; bool = zza("param", str, 100, localObject, paramBoolean2))
          {
            if (!bool)
              break label523;
            j = 0;
            break;
          }
          label523: j = 4;
        }
        label529: if (zzcc(str))
        {
          k = i + 1;
          j = k;
          if (k > 25)
          {
            localObject = 48 + "Event can't contain more than 25 params";
            zzge().zzim().zze((String)localObject, zzga().zzbj(paramString), zzga().zzb(paramBundle));
            zza(localBundle, 5);
            localBundle.remove(str);
            i = k;
          }
        }
        else
        {
          j = i;
          i = j;
        }
      }
    }
    AppMethodBeat.o(69518);
    return localBundle;
  }

  final <T extends Parcelable> T zza(byte[] paramArrayOfByte, Parcelable.Creator<T> paramCreator)
  {
    AppMethodBeat.i(69551);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(69551);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
        localParcel.setDataPosition(0);
        paramArrayOfByte = (Parcelable)paramCreator.createFromParcel(localParcel);
        localParcel.recycle();
        AppMethodBeat.o(69551);
      }
      catch (SafeParcelReader.ParseException paramArrayOfByte)
      {
        zzge().zzim().log("Failed to load parcelable from buffer");
        localParcel.recycle();
        AppMethodBeat.o(69551);
        paramArrayOfByte = null;
      }
      finally
      {
        localParcel.recycle();
        AppMethodBeat.o(69551);
      }
    }
    throw paramArrayOfByte;
  }

  final zzeu zza(String paramString1, Bundle paramBundle, String paramString2, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(69546);
    if (TextUtils.isEmpty(paramString1))
    {
      paramString1 = null;
      AppMethodBeat.o(69546);
      return paramString1;
    }
    if (zzcd(paramString1) != 0)
    {
      zzge().zzim().zzg("Invalid conditional property event name", zzga().zzbl(paramString1));
      paramString1 = new IllegalArgumentException();
      AppMethodBeat.o(69546);
      throw paramString1;
    }
    if (paramBundle != null);
    for (paramBundle = new Bundle(paramBundle); ; paramBundle = new Bundle())
    {
      paramBundle.putString("_o", paramString2);
      paramString1 = new zzeu(paramString1, new zzer(zzd(zza(paramString1, paramBundle, CollectionUtils.listOf("_o"), false, false))), paramString2, paramLong);
      AppMethodBeat.o(69546);
      break;
    }
  }

  public final void zza(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(69527);
    zza(null, paramInt1, paramString1, paramString2, paramInt2);
    AppMethodBeat.o(69527);
  }

  public final void zza(Bundle paramBundle, String paramString, Object paramObject)
  {
    AppMethodBeat.i(69526);
    if (paramBundle == null)
      AppMethodBeat.o(69526);
    while (true)
    {
      return;
      if ((paramObject instanceof Long))
      {
        paramBundle.putLong(paramString, ((Long)paramObject).longValue());
        AppMethodBeat.o(69526);
      }
      else if ((paramObject instanceof String))
      {
        paramBundle.putString(paramString, String.valueOf(paramObject));
        AppMethodBeat.o(69526);
      }
      else
      {
        if (!(paramObject instanceof Double))
          break;
        paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
        AppMethodBeat.o(69526);
      }
    }
    if (paramString != null)
      if (paramObject == null)
        break label145;
    label145: for (paramBundle = paramObject.getClass().getSimpleName(); ; paramBundle = null)
    {
      zzge().zziq().zze("Not putting event parameter. Invalid value type. name, type", zzga().zzbk(paramString), paramBundle);
      AppMethodBeat.o(69526);
      break;
    }
  }

  public final void zza(zzko paramzzko, Object paramObject)
  {
    AppMethodBeat.i(69525);
    Preconditions.checkNotNull(paramObject);
    paramzzko.zzajf = null;
    paramzzko.zzate = null;
    paramzzko.zzarc = null;
    if ((paramObject instanceof String))
    {
      paramzzko.zzajf = ((String)paramObject);
      AppMethodBeat.o(69525);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Long))
      {
        paramzzko.zzate = ((Long)paramObject);
        AppMethodBeat.o(69525);
      }
      else if ((paramObject instanceof Double))
      {
        paramzzko.zzarc = ((Double)paramObject);
        AppMethodBeat.o(69525);
      }
      else
      {
        zzge().zzim().zzg("Ignoring invalid (type) event param value", paramObject);
        AppMethodBeat.o(69525);
      }
    }
  }

  public final void zza(zzks paramzzks, Object paramObject)
  {
    AppMethodBeat.i(69524);
    Preconditions.checkNotNull(paramObject);
    paramzzks.zzajf = null;
    paramzzks.zzate = null;
    paramzzks.zzarc = null;
    if ((paramObject instanceof String))
    {
      paramzzks.zzajf = ((String)paramObject);
      AppMethodBeat.o(69524);
    }
    while (true)
    {
      return;
      if ((paramObject instanceof Long))
      {
        paramzzks.zzate = ((Long)paramObject);
        AppMethodBeat.o(69524);
      }
      else if ((paramObject instanceof Double))
      {
        paramzzks.zzarc = ((Double)paramObject);
        AppMethodBeat.o(69524);
      }
      else
      {
        zzge().zzim().zzg("Ignoring invalid (type) user attribute value", paramObject);
        AppMethodBeat.o(69524);
      }
    }
  }

  public final void zza(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(69528);
    paramString1 = new Bundle();
    zza(paramString1, paramInt1);
    if (!TextUtils.isEmpty(paramString2))
      paramString1.putString(paramString2, paramString3);
    if ((paramInt1 == 6) || (paramInt1 == 7) || (paramInt1 == 2))
      paramString1.putLong("_el", paramInt2);
    this.zzacw.zzfu().logEvent("auto", "_err", paramString1);
    AppMethodBeat.o(69528);
  }

  public final boolean zza(long paramLong1, long paramLong2)
  {
    boolean bool = true;
    AppMethodBeat.i(69534);
    if ((paramLong1 == 0L) || (paramLong2 <= 0L))
      AppMethodBeat.o(69534);
    while (true)
    {
      return bool;
      if (Math.abs(zzbt().currentTimeMillis() - paramLong1) > paramLong2)
      {
        AppMethodBeat.o(69534);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(69534);
      }
    }
  }

  final boolean zza(String paramString1, int paramInt, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(69508);
    if (paramString2 == null)
    {
      zzge().zzim().zzg("Name is required and can't be null. Type", paramString1);
      AppMethodBeat.o(69508);
    }
    while (true)
    {
      return bool;
      if (paramString2.codePointCount(0, paramString2.length()) > paramInt)
      {
        zzge().zzim().zzd("Name is too long. Type, maximum supported length, name", paramString1, Integer.valueOf(paramInt), paramString2);
        AppMethodBeat.o(69508);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(69508);
      }
    }
  }

  final boolean zza(String paramString1, String[] paramArrayOfString, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(69507);
    if (paramString2 == null)
    {
      zzge().zzim().zzg("Name is required and can't be null. Type", paramString1);
      AppMethodBeat.o(69507);
    }
    while (true)
    {
      return bool;
      Preconditions.checkNotNull(paramString2);
      int i = 0;
      label44: if (i < zzard.length)
        if (!paramString2.startsWith(zzard[i]));
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label110;
        zzge().zzim().zze("Name starts with reserved prefix. Type, name", paramString1, paramString2);
        AppMethodBeat.o(69507);
        break;
        i++;
        break label44;
      }
      label110: if (paramArrayOfString != null)
      {
        Preconditions.checkNotNull(paramArrayOfString);
        i = 0;
        label122: if (i < paramArrayOfString.length)
          if (!zzs(paramString2, paramArrayOfString[i]));
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label184;
          zzge().zzim().zze("Name is reserved. Type, name", paramString1, paramString2);
          AppMethodBeat.o(69507);
          break;
          i++;
          break label122;
        }
      }
      label184: AppMethodBeat.o(69507);
      bool = true;
    }
  }

  public final byte[] zza(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(69529);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(69529);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      zzge().zzim().zzg("Failed to gzip content", paramArrayOfByte);
      AppMethodBeat.o(69529);
    }
    throw paramArrayOfByte;
  }

  public final byte[] zzb(zzkp paramzzkp)
  {
    AppMethodBeat.i(69533);
    try
    {
      byte[] arrayOfByte = new byte[paramzzkp.zzvm()];
      zzabw localzzabw = zzabw.zzb(arrayOfByte, 0, arrayOfByte.length);
      paramzzkp.zza(localzzabw);
      localzzabw.zzve();
      AppMethodBeat.o(69533);
      paramzzkp = arrayOfByte;
      return paramzzkp;
    }
    catch (IOException paramzzkp)
    {
      while (true)
      {
        zzge().zzim().zzg("Data loss. Failed to serialize batch", paramzzkp);
        paramzzkp = null;
        AppMethodBeat.o(69533);
      }
    }
  }

  public final byte[] zzb(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(69530);
    ByteArrayInputStream localByteArrayInputStream;
    GZIPInputStream localGZIPInputStream;
    ByteArrayOutputStream localByteArrayOutputStream;
    try
    {
      localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(paramArrayOfByte);
      localGZIPInputStream = new java/util/zip/GZIPInputStream;
      localGZIPInputStream.<init>(localByteArrayInputStream);
      localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      paramArrayOfByte = new byte[1024];
      while (true)
      {
        int i = localGZIPInputStream.read(paramArrayOfByte);
        if (i <= 0)
          break;
        localByteArrayOutputStream.write(paramArrayOfByte, 0, i);
      }
    }
    catch (IOException paramArrayOfByte)
    {
      zzge().zzim().zzg("Failed to ungzip content", paramArrayOfByte);
      AppMethodBeat.o(69530);
      throw paramArrayOfByte;
    }
    localGZIPInputStream.close();
    localByteArrayInputStream.close();
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    AppMethodBeat.o(69530);
    return paramArrayOfByte;
  }

  public final int zzcd(String paramString)
  {
    int i = 2;
    AppMethodBeat.i(69509);
    if (!zzr("event", paramString))
      AppMethodBeat.o(69509);
    while (true)
    {
      return i;
      if (!zza("event", AppMeasurement.Event.zzacx, paramString))
      {
        i = 13;
        AppMethodBeat.o(69509);
      }
      else if (!zza("event", 40, paramString))
      {
        AppMethodBeat.o(69509);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(69509);
      }
    }
  }

  public final int zzce(String paramString)
  {
    int i = 6;
    AppMethodBeat.i(69510);
    if (!zzq("user property", paramString))
      AppMethodBeat.o(69510);
    while (true)
    {
      return i;
      if (!zza("user property", AppMeasurement.UserProperty.zzadb, paramString))
      {
        i = 15;
        AppMethodBeat.o(69510);
      }
      else if (!zza("user property", 24, paramString))
      {
        AppMethodBeat.o(69510);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(69510);
      }
    }
  }

  public final int zzcf(String paramString)
  {
    int i = 6;
    AppMethodBeat.i(69511);
    if (!zzr("user property", paramString))
      AppMethodBeat.o(69511);
    while (true)
    {
      return i;
      if (!zza("user property", AppMeasurement.UserProperty.zzadb, paramString))
      {
        i = 15;
        AppMethodBeat.o(69511);
      }
      else if (!zza("user property", 24, paramString))
      {
        AppMethodBeat.o(69511);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(69511);
      }
    }
  }

  public final boolean zzcg(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(69513);
    if (TextUtils.isEmpty(paramString))
    {
      zzge().zzim().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
      AppMethodBeat.o(69513);
    }
    while (true)
    {
      return bool;
      Preconditions.checkNotNull(paramString);
      if (!paramString.matches("^1:\\d+:android:[a-f0-9]+$"))
      {
        zzge().zzim().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", paramString);
        AppMethodBeat.o(69513);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(69513);
      }
    }
  }

  public final boolean zzcj(String paramString)
  {
    AppMethodBeat.i(69540);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(69540);
    }
    while (true)
    {
      return bool;
      bool = zzgg().zzhj().equals(paramString);
      AppMethodBeat.o(69540);
    }
  }

  final long zzd(Context paramContext, String paramString)
  {
    long l = -1L;
    AppMethodBeat.i(69547);
    zzab();
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotEmpty(paramString);
    PackageManager localPackageManager = paramContext.getPackageManager();
    MessageDigest localMessageDigest = getMessageDigest("MD5");
    if (localMessageDigest == null)
      zzge().zzim().log("Could not get MD5 instance");
    while (true)
    {
      AppMethodBeat.o(69547);
      return l;
      if (localPackageManager != null)
        try
        {
          if (!zze(paramContext, paramString))
          {
            paramContext = Wrappers.packageManager(paramContext).getPackageInfo(getContext().getPackageName(), 64);
            if ((paramContext.signatures != null) && (paramContext.signatures.length > 0))
            {
              l = zzc(localMessageDigest.digest(paramContext.signatures[0].toByteArray()));
              continue;
            }
            zzge().zzip().log("Could not get signatures");
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          zzge().zzim().zzg("Package name not found", paramContext);
        }
      else
        l = 0L;
    }
  }

  final Bundle zzd(Bundle paramBundle)
  {
    AppMethodBeat.i(69542);
    Bundle localBundle = new Bundle();
    if (paramBundle != null)
    {
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = zzh(str, paramBundle.get(str));
        if (localObject == null)
          zzge().zzip().zzg("Param value can't be null", zzga().zzbk(str));
        else
          zza(localBundle, str, localObject);
      }
    }
    AppMethodBeat.o(69542);
    return localBundle;
  }

  public final Object zzh(String paramString, Object paramObject)
  {
    int i = 256;
    AppMethodBeat.i(69516);
    if ("_ev".equals(paramString))
    {
      paramString = zza(256, paramObject, true);
      AppMethodBeat.o(69516);
      return paramString;
    }
    if (zzci(paramString));
    while (true)
    {
      paramString = zza(i, paramObject, false);
      AppMethodBeat.o(69516);
      break;
      i = 100;
    }
  }

  protected final boolean zzhf()
  {
    return true;
  }

  public final int zzi(String paramString, Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(69522);
    boolean bool;
    if ("_ldl".equals(paramString))
    {
      bool = zza("user property referrer", paramString, zzch(paramString), paramObject, false);
      if (!bool)
        break label66;
      AppMethodBeat.o(69522);
    }
    while (true)
    {
      return i;
      bool = zza("user property", paramString, zzch(paramString), paramObject, false);
      break;
      label66: i = 7;
      AppMethodBeat.o(69522);
    }
  }

  protected final void zzih()
  {
    AppMethodBeat.i(69499);
    zzab();
    SecureRandom localSecureRandom = new SecureRandom();
    long l1 = localSecureRandom.nextLong();
    long l2 = l1;
    if (l1 == 0L)
    {
      l1 = localSecureRandom.nextLong();
      l2 = l1;
      if (l1 == 0L)
      {
        zzge().zzip().log("Utils falling back to Random for random id");
        l2 = l1;
      }
    }
    this.zzarf.set(l2);
    AppMethodBeat.o(69499);
  }

  public final Object zzj(String paramString, Object paramObject)
  {
    AppMethodBeat.i(69523);
    if ("_ldl".equals(paramString))
    {
      paramString = zza(zzch(paramString), paramObject, true);
      AppMethodBeat.o(69523);
    }
    while (true)
    {
      return paramString;
      paramString = zza(zzch(paramString), paramObject, false);
      AppMethodBeat.o(69523);
    }
  }

  public final long zzlb()
  {
    AppMethodBeat.i(69500);
    if (this.zzarf.get() == 0L);
    while (true)
    {
      long l;
      synchronized (this.zzarf)
      {
        Random localRandom = new java/util/Random;
        localRandom.<init>(System.nanoTime() ^ zzbt().currentTimeMillis());
        l = localRandom.nextLong();
        int i = this.zzarg + 1;
        this.zzarg = i;
        l += i;
        AppMethodBeat.o(69500);
        return l;
      }
      synchronized (this.zzarf)
      {
        this.zzarf.compareAndSet(-1L, 1L);
        l = this.zzarf.getAndIncrement();
        AppMethodBeat.o(69500);
      }
    }
  }

  final SecureRandom zzlc()
  {
    AppMethodBeat.i(69501);
    zzab();
    if (this.zzare == null)
      this.zzare = new SecureRandom();
    SecureRandom localSecureRandom = this.zzare;
    AppMethodBeat.o(69501);
    return localSecureRandom;
  }

  public final int zzld()
  {
    AppMethodBeat.i(69555);
    if (this.zzarh == null)
      this.zzarh = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(getContext()) / 1000);
    int i = this.zzarh.intValue();
    AppMethodBeat.o(69555);
    return i;
  }

  final boolean zzq(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(69505);
    if (paramString2 == null)
    {
      zzge().zzim().zzg("Name is required and can't be null. Type", paramString1);
      AppMethodBeat.o(69505);
    }
    while (true)
    {
      return bool;
      if (paramString2.length() == 0)
      {
        zzge().zzim().zzg("Name is required and can't be empty. Type", paramString1);
        AppMethodBeat.o(69505);
      }
      else
      {
        int i = paramString2.codePointAt(0);
        if (!Character.isLetter(i))
        {
          zzge().zzim().zze("Name must start with a letter. Type, name", paramString1, paramString2);
          AppMethodBeat.o(69505);
        }
        else
        {
          int j = paramString2.length();
          i = Character.charCount(i);
          while (true)
          {
            if (i >= j)
              break label183;
            int k = paramString2.codePointAt(i);
            if ((k != 95) && (!Character.isLetterOrDigit(k)))
            {
              zzge().zzim().zze("Name must consist of letters, digits or _ (underscores). Type, name", paramString1, paramString2);
              AppMethodBeat.o(69505);
              break;
            }
            i += Character.charCount(k);
          }
          label183: bool = true;
          AppMethodBeat.o(69505);
        }
      }
    }
  }

  public final boolean zzx(String paramString)
  {
    AppMethodBeat.i(69536);
    zzab();
    boolean bool;
    if (Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(paramString) == 0)
    {
      bool = true;
      AppMethodBeat.o(69536);
    }
    while (true)
    {
      return bool;
      zzge().zzis().zzg("Permission not granted", paramString);
      bool = false;
      AppMethodBeat.o(69536);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzka
 * JD-Core Version:    0.6.2
 */