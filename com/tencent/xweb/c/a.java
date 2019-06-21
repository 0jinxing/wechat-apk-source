package com.tencent.xweb.c;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xwalk.core.XWalkEnvironment;

public final class a
{
  public static final class b
  {
    public int AOO = -1;
    public int AOP = -1;
    public int AOQ = -1;
    public int AOR = -1;
    public int AOS = -1;
    public int AOT = -1;
    public String AOU = "";
    public String AOV = "";
    public int AOW = -1;
    public int AOX = -1;
    public int AOY = -1;
    public int AOZ = -1;
    public int APa = -1;
    public String APb = "";
    public String APc = "";
    public int APd = -1;
    public int APe = -1;
    public int APf = -1;
    public int APg = -1;

    private static boolean aM(int paramInt1, int paramInt2, int paramInt3)
    {
      boolean bool = false;
      if ((paramInt3 > 0) && (paramInt1 > paramInt3));
      while (true)
      {
        return bool;
        if ((paramInt2 <= 0) || (paramInt1 >= paramInt2))
          bool = true;
      }
    }

    private static boolean avi(String paramString)
    {
      AppMethodBeat.i(3969);
      String str1 = "";
      if (Build.BRAND != null)
        str1 = "" + Build.BRAND;
      String str2 = str1;
      if (Build.MODEL != null)
        str2 = str1 + " " + Build.MODEL;
      boolean bool;
      if ((paramString == null) || (str2 == null) || (paramString.isEmpty()))
      {
        bool = false;
        AppMethodBeat.o(3969);
      }
      while (true)
      {
        return bool;
        bool = iH(paramString, str2);
        AppMethodBeat.o(3969);
      }
    }

    private static boolean iH(String paramString1, String paramString2)
    {
      boolean bool1 = false;
      boolean bool2 = false;
      AppMethodBeat.i(3970);
      if ((paramString1 == null) || (paramString1.isEmpty()) || (paramString1.trim() == null) || (paramString1.trim().isEmpty()))
      {
        AppMethodBeat.o(3970);
        bool1 = bool2;
      }
      while (true)
      {
        return bool1;
        if ((paramString2 == null) || (paramString2.isEmpty()))
        {
          AppMethodBeat.o(3970);
          bool1 = bool2;
          continue;
        }
        try
        {
          bool2 = Pattern.compile(paramString1).matcher(paramString2.toUpperCase()).find();
          bool1 = bool2;
          AppMethodBeat.o(3970);
        }
        catch (Exception paramString1)
        {
          while (true)
            XWalkEnvironment.addXWalkInitializeLog("ConfigDef", " _IsMatchRex compile strRex failed");
        }
      }
    }

    public final boolean dUw()
    {
      boolean bool = false;
      AppMethodBeat.i(3968);
      int i = XWalkEnvironment.getInstalledNewstVersion();
      int j = WebView.getTbsSDKVersion(XWalkEnvironment.getApplicationContext());
      int k = WebView.getInstalledTbsCoreVersion(XWalkEnvironment.getApplicationContext());
      if ((aM(i, this.AOQ, this.AOR)) && (aM(190301, this.AOO, this.AOP)) && (aM(j, this.APd, this.APe)) && (aM(k, this.APf, this.APg)) && (aM(Build.VERSION.SDK_INT, this.AOS, this.AOT)) && (aM(XWalkEnvironment.getGrayValue(), this.AOW, this.AOX)) && (!avi(this.AOU)) && (!iH(this.APb, XWalkEnvironment.getPackageName())))
        if ((this.APa > 0) && (XWalkEnvironment.getUserType() != this.APa))
          AppMethodBeat.o(3968);
      while (true)
      {
        return bool;
        if ((this.AOV != null) && (this.AOV.trim() != null) && (!this.AOV.trim().isEmpty()) && (!avi(this.AOV)))
        {
          AppMethodBeat.o(3968);
        }
        else if ((this.APc != null) && (this.APc.trim() != null) && (!this.APc.trim().isEmpty()) && (!iH(this.APc, XWalkEnvironment.getPackageName())))
        {
          AppMethodBeat.o(3968);
        }
        else if (((this.AOY > 0) || (this.AOZ > 0)) && (!aM(XWalkEnvironment.getChromiunVersion(), this.AOY, this.AOZ)))
        {
          AppMethodBeat.o(3968);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(3968);
          continue;
          AppMethodBeat.o(3968);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c.a
 * JD-Core Version:    0.6.2
 */