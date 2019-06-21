package com.tencent.mm.app;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.util.a;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import org.xmlpull.v1.XmlPullParserException;

public final class u
{
  public static boolean b(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    boolean bool = false;
    AppMethodBeat.i(115034);
    int i = paramArrayOfStackTraceElement.length;
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfStackTraceElement[j].getClassName();
      if ((str != null) && ((str.contains("de.robv.android.xposed.XposedBridge")) || (str.contains("com.zte.heartyservice.SCC.FrameworkBridge"))))
      {
        bool = true;
        AppMethodBeat.o(115034);
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(115034);
    }
  }

  public static void f(Throwable paramThrowable)
  {
    AppMethodBeat.i(115035);
    ApplicationLike localApplicationLike = b.cdV;
    if ((localApplicationLike == null) || (localApplicationLike.getApplication() == null))
    {
      a.w("TinkerCrashProtect", "applicationlike is null", new Object[0]);
      AppMethodBeat.o(115035);
    }
    while (true)
    {
      return;
      if (com.tencent.tinker.lib.e.b.c(localApplicationLike))
        break;
      a.w("TinkerCrashProtect", "tinker is not loaded", new Object[0]);
      AppMethodBeat.o(115035);
    }
    int i;
    label87: boolean bool;
    if ((Build.MODEL.contains("ZUK")) || (Build.MODEL.contains("zuk")))
    {
      i = 1;
      bool = false;
      label89: if (paramThrowable == null)
        break label274;
      if (bool)
        break label288;
      bool = b(paramThrowable.getStackTrace());
    }
    label274: label282: label288: 
    while (true)
    {
      if (bool)
        if ((!(paramThrowable instanceof IllegalAccessError)) || (!paramThrowable.getMessage().contains("Class ref in pre-verified class resolved to unexpected implementation")))
          break label282;
      for (int j = 1; ; j = 0)
      {
        if (j != 0)
        {
          a.e("TinkerCrashProtect", "have xposed: just clean tinker", new Object[0]);
          ShareTinkerInternals.jr(localApplicationLike.getApplication());
          com.tencent.tinker.lib.e.b.e(localApplicationLike);
          ShareTinkerInternals.jm(localApplicationLike.getApplication());
          AppMethodBeat.o(115035);
          break;
          i = 0;
          break label87;
        }
        if (i != 0)
        {
          a.w("TinkerCrashProtect", "it is zuk model here, crash:" + paramThrowable.getMessage(), new Object[0]);
          if (((paramThrowable instanceof XmlPullParserException)) && (paramThrowable.getMessage().contains("tag requires a 'drawable' attribute or child tag defining a drawable")))
          {
            a.e("TinkerCrashProtect", "have zuk parse error: just clean tinker", new Object[0]);
            ShareTinkerInternals.jr(localApplicationLike.getApplication());
            com.tencent.tinker.lib.e.b.e(localApplicationLike);
            ShareTinkerInternals.jm(localApplicationLike.getApplication());
            AppMethodBeat.o(115035);
            break;
          }
        }
        paramThrowable = paramThrowable.getCause();
        break label89;
        AppMethodBeat.o(115035);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.u
 * JD-Core Version:    0.6.2
 */