package com.tencent.mm.ui.widget.snackbar;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static boolean zTW = false;

  public static void a(Activity paramActivity, String paramString1, String paramString2, a.b paramb)
  {
    AppMethodBeat.i(112984);
    paramActivity = new a.a(paramActivity);
    paramActivity.nqb = paramString1;
    paramActivity.zTI = paramString2;
    a(paramActivity.a(Short.valueOf((short)2500)), paramb, null);
    AppMethodBeat.o(112984);
  }

  public static void a(Activity paramActivity, String paramString1, String paramString2, a.b paramb, a.c paramc)
  {
    AppMethodBeat.i(112986);
    paramActivity = new a.a(paramActivity);
    paramActivity.nqb = paramString1;
    paramActivity.zTI = paramString2;
    a(paramActivity.a(Short.valueOf((short)2500)), paramb, paramc);
    AppMethodBeat.o(112986);
  }

  public static void a(Context paramContext, View paramView, String paramString, a.c paramc)
  {
    AppMethodBeat.i(112988);
    paramContext = new a.a(paramContext, paramView);
    paramContext.nqb = paramString;
    paramContext = paramContext.a(Short.valueOf((short)1500));
    if (paramc != null)
      paramContext.a(paramc);
    paramContext.dLw();
    AppMethodBeat.o(112988);
  }

  public static void a(Context paramContext, View paramView, String paramString1, String paramString2)
  {
    AppMethodBeat.i(112985);
    paramContext = new a.a(paramContext, paramView);
    paramContext.nqb = paramString1;
    paramContext.zTI = paramString2;
    a(paramContext.a(Short.valueOf((short)2500)), null, null);
    AppMethodBeat.o(112985);
  }

  public static void a(Fragment paramFragment, String paramString1, String paramString2, a.b paramb, a.c paramc)
  {
    AppMethodBeat.i(112987);
    paramFragment = new a.a(paramFragment.getContext(), paramFragment.getView());
    paramFragment.nqb = paramString1;
    paramFragment.zTI = paramString2;
    a(paramFragment.a(Short.valueOf((short)2500)), paramb, paramc);
    AppMethodBeat.o(112987);
  }

  private static void a(a.a parama, a.b paramb, a.c paramc)
  {
    AppMethodBeat.i(112990);
    if (paramb != null)
      parama.a(paramb);
    if (paramc != null)
      parama.a(paramc);
    parama.dLw();
    AppMethodBeat.o(112990);
  }

  public static boolean aFF()
  {
    return zTW;
  }

  public static void i(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(112989);
    paramActivity = new a.a(paramActivity);
    paramActivity.nqb = paramString;
    a(paramActivity.a(Short.valueOf((short)1500)), null, null);
    AppMethodBeat.o(112989);
  }

  public static void rf(boolean paramBoolean)
  {
    zTW = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.b
 * JD-Core Version:    0.6.2
 */