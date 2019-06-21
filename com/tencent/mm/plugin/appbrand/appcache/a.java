package com.tencent.mm.plugin.appbrand.appcache;

import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.appstorage.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Locale;

public abstract class a
  implements o
{
  volatile String gSc;
  volatile String gSd;
  volatile String versionName;

  public final String avk()
  {
    String str1;
    String str2;
    Object localObject1;
    Object localObject2;
    String str3;
    String str4;
    if (TextUtils.isEmpty(this.versionName))
    {
      str1 = "";
      str2 = "";
      localObject1 = null;
      localObject2 = null;
      str3 = str2;
      str4 = str1;
    }
    try
    {
      InputStream localInputStream = openRead("WAVersion.json");
      localObject2 = localInputStream;
      str3 = str2;
      str4 = str1;
      localObject1 = localInputStream;
      String str5 = com.tencent.luggage.g.i.convertStreamToString(localInputStream);
      localObject2 = localInputStream;
      str3 = str2;
      str4 = str1;
      localObject1 = localInputStream;
      com.tencent.mm.aa.i locali = new com/tencent/mm/aa/i;
      localObject2 = localInputStream;
      str3 = str2;
      str4 = str1;
      localObject1 = localInputStream;
      locali.<init>(str5);
      localObject2 = localInputStream;
      str3 = str2;
      str4 = str1;
      localObject1 = localInputStream;
      str1 = locali.getString("version");
      localObject2 = localInputStream;
      str3 = str2;
      str4 = str1;
      localObject1 = localInputStream;
      str2 = locali.getString("updateTime");
      localObject2 = localInputStream;
      str3 = str2;
      str4 = str1;
      localObject1 = localInputStream;
      ab.i("MicroMsg.AppBrand.AbsReader", "AbsReader version parsed version = [%s] raw = [%s]", new Object[] { str1, str5 });
      bo.b(localInputStream);
      localObject2 = str1;
      str3 = str2;
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = "";
      this.versionName = ((String)localObject1);
      this.gSc = str3;
      this.gSd = String.format(Locale.US, "%s (%s)", new Object[] { this.versionName, this.gSc });
      return this.versionName;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("MicroMsg.AppBrand.AbsReader", localException, "get WAVersion.json failed.", new Object[0]);
        bo.b((Closeable)localObject2);
        localObject2 = str4;
      }
    }
    finally
    {
      bo.b((Closeable)localObject1);
    }
  }

  public final String avl()
  {
    return this.gSd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.a
 * JD-Core Version:    0.6.2
 */