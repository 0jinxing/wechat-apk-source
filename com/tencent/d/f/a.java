package com.tencent.d.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  // ERROR //
  private static java.security.cert.Certificate a(CertificateFactory paramCertificateFactory, android.content.pm.Signature paramSignature)
  {
    // Byte code:
    //   0: ldc 11
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 19	java/io/ByteArrayInputStream
    //   8: dup
    //   9: aload_1
    //   10: invokevirtual 25	android/content/pm/Signature:toByteArray	()[B
    //   13: invokespecial 29	java/io/ByteArrayInputStream:<init>	([B)V
    //   16: astore_1
    //   17: aload_0
    //   18: aload_1
    //   19: invokevirtual 35	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   22: checkcast 37	java/security/cert/X509Certificate
    //   25: astore_0
    //   26: aload_1
    //   27: invokevirtual 41	java/io/ByteArrayInputStream:close	()V
    //   30: ldc 11
    //   32: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_0
    //   36: areturn
    //   37: astore_0
    //   38: aload_1
    //   39: invokevirtual 41	java/io/ByteArrayInputStream:close	()V
    //   42: aconst_null
    //   43: astore_0
    //   44: goto -14 -> 30
    //   47: astore_0
    //   48: aconst_null
    //   49: astore_0
    //   50: goto -20 -> 30
    //   53: astore_0
    //   54: aload_1
    //   55: invokevirtual 41	java/io/ByteArrayInputStream:close	()V
    //   58: ldc 11
    //   60: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: aload_0
    //   64: athrow
    //   65: astore_1
    //   66: goto -36 -> 30
    //   69: astore_1
    //   70: goto -12 -> 58
    //
    // Exception table:
    //   from	to	target	type
    //   17	26	37	java/lang/Throwable
    //   38	42	47	java/io/IOException
    //   17	26	53	finally
    //   26	30	65	java/io/IOException
    //   54	58	69	java/io/IOException
  }

  public static List<byte[]> cb(Context paramContext, String paramString)
  {
    AppMethodBeat.i(114589);
    ArrayList localArrayList = new ArrayList();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      if ((paramContext != null) && (paramContext.signatures != null) && (paramContext.signatures.length > 0))
      {
        paramContext = paramContext.signatures;
        int i = 0;
        while (true)
          if ((i < paramContext.length) && (i < 5))
          {
            paramString = (X509Certificate)a(CertificateFactory.getInstance("X.509"), paramContext[i]);
            if (paramString != null);
            try
            {
              localArrayList.add(e.cn(paramString.getEncoded()));
              i++;
            }
            catch (CertificateEncodingException paramString)
            {
              while (true)
                h.dc("extractPkgCertMd5s(), CertificateEncodingException: ".concat(String.valueOf(paramString)));
            }
          }
      }
    }
    catch (Throwable paramContext)
    {
      h.dc("extractPkgCertMd5s(), Exception: ".concat(String.valueOf(paramContext)));
      AppMethodBeat.o(114589);
    }
    return localArrayList;
  }

  public static com.tencent.d.a.a cc(Context paramContext, String paramString)
  {
    AppMethodBeat.i(114590);
    com.tencent.d.a.a locala = new com.tencent.d.a.a();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      locala.ceO = paramString;
      locala.versionName = paramContext.versionName;
      locala.versionCode = paramContext.versionCode;
      paramContext = (X509Certificate)a(CertificateFactory.getInstance("X.509"), paramContext.signatures[0]);
      if (paramContext != null)
        locala.ArC = e.bytesToHexString(e.cn(paramContext.getEncoded()));
      label81: AppMethodBeat.o(114590);
      return locala;
    }
    catch (Throwable paramContext)
    {
      break label81;
    }
  }

  public static List<com.tencent.d.a.a> iJ(Context paramContext)
  {
    AppMethodBeat.i(114588);
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      try
      {
        String str = paramContext.getPackageName();
        PackageManager localPackageManager = paramContext.getPackageManager();
        Iterator localIterator = localPackageManager.getInstalledApplications(0).iterator();
        if (localIterator.hasNext())
        {
          ApplicationInfo localApplicationInfo = (ApplicationInfo)localIterator.next();
          if ((localApplicationInfo.packageName == null) || (localApplicationInfo.packageName.equals(str)))
            continue;
          if ((localApplicationInfo.flags & 0x1) == 0)
            break label240;
          i = 1;
          com.tencent.d.a.a locala = cc(paramContext, localApplicationInfo.packageName);
          locala.ArB = localPackageManager.getApplicationLabel(localApplicationInfo).toString();
          if (locala.ArB == null)
            locala.ArB = "";
          if (i == 0)
            break label246;
          i = 1;
          locala.egi = i;
          Object localObject = new java/io/File;
          ((File)localObject).<init>(localApplicationInfo.sourceDir);
          locala.fileSize = ((File)localObject).length();
          locala.ArD = localApplicationInfo.sourceDir;
          localArrayList.add(locala);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("add app: ");
          ((StringBuilder)localObject).append(localApplicationInfo.packageName);
          h.dQI();
          continue;
        }
      }
      catch (Throwable paramContext)
      {
        h.db("getAllAppInfos(), exception: ".concat(String.valueOf(paramContext)));
        AppMethodBeat.o(114588);
        return localArrayList;
      }
      label240: int i = 0;
      continue;
      label246: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.a
 * JD-Core Version:    0.6.2
 */