package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class cr
{
  public String a;
  private boolean b;
  private boolean c;
  private int d;
  private URL e;
  private String f;
  private int g;

  public cr(URL paramURL, String paramString)
  {
    AppMethodBeat.i(98659);
    if (ce.a.a("direct_access_use_schedule", 0, 1, 1) == 1);
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.b = bool2;
      bool2 = bool1;
      if (ce.a.a("direct_https_use_sche", 0, 1, 1) == 1)
        bool2 = true;
      this.c = bool2;
      this.d = ce.a.a("direct_access_domain_try_times", 1, 8, 2);
      this.a = "";
      this.e = paramURL;
      this.f = paramString;
      AppMethodBeat.o(98659);
      return;
    }
  }

  public final String a(bu parambu)
  {
    AppMethodBeat.i(98660);
    Object localObject;
    if (parambu.e())
    {
      localObject = this.f;
      AppMethodBeat.o(98660);
      return localObject;
    }
    label71: String str;
    if (!this.e.getProtocol().startsWith("https"))
    {
      localObject = "http://" + parambu.a() + ":" + parambu.c();
      str = this.e.getFile();
      parambu = (bu)localObject;
      if (!TextUtils.isEmpty(str))
        if (!str.startsWith("/"))
          break label235;
    }
    label235: for (parambu = (String)localObject + str; ; parambu = (String)localObject + "/" + str)
    {
      str = this.e.getRef();
      localObject = parambu;
      if (!TextUtils.isEmpty(str))
        localObject = parambu + "#" + str;
      AppMethodBeat.o(98660);
      break;
      if (this.g != 0)
      {
        localObject = "https://" + parambu.a() + ":" + this.g;
        break label71;
      }
      localObject = "https://" + parambu.a() + ":443";
      break label71;
    }
  }

  public final List<bu> a(cp paramcp, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 3;
    int j = 0;
    AppMethodBeat.i(98661);
    bu localbu = new bu(this.e.getHost(), -1);
    localbu.a((byte)3);
    try
    {
      paramcp = new java/util/ArrayList;
      paramcp.<init>();
      if (!paramBoolean1)
      {
        paramcp.add(localbu);
        localbu.a = 1;
      }
      while (true)
      {
        AppMethodBeat.o(98661);
        return paramcp;
        if ((ce.i()) || (!this.b) || ((paramBoolean2) && (!this.c)))
        {
          for (k = 0; k < this.d; k++)
            paramcp.add(localbu);
          if (ce.i())
            k = 2;
          while (true)
          {
            localbu.a = k;
            break;
            k = i;
            if (this.b)
              k = 4;
          }
        }
        if ((paramBoolean2) && (Build.VERSION.SDK_INT <= 18))
        {
          for (k = 0; k < this.d; k++)
            paramcp.add(localbu);
          localbu.a = 10;
        }
        else
        {
          cc localcc = cp.a(this.e.getHost());
          paramcp = localcc.c;
          this.g = localcc.d;
          this.a = localcc.b;
        }
      }
    }
    catch (Exception paramcp)
    {
      while (true)
      {
        paramcp = new ArrayList();
        for (int k = j; k < this.d; k++)
          paramcp.add(localbu);
        localbu.a = 8;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cr
 * JD-Core Version:    0.6.2
 */