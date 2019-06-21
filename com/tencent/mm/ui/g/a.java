package com.tencent.mm.ui.g;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static b zzB;
  private static b zzC;

  @TargetApi(11)
  public static void a(Activity paramActivity, View paramView)
  {
    AppMethodBeat.i(107423);
    View localView = paramActivity.getWindow().getDecorView();
    zzB = b.ig(paramActivity);
    zzC = b.ig(paramActivity);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    Rect localRect = new Rect();
    paramActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    int i = localRect.top;
    int j = ((AppCompatActivity)paramActivity).getSupportActionBar().getHeight();
    int k = arrayOfInt[1];
    zzB.setHeight(k - i - j);
    int m = db(paramActivity)[1];
    int n = arrayOfInt[1];
    k = paramView.getHeight();
    zzC.setHeight(m - n - k);
    zzB.showAtLocation(localView, 48, 0, j + i);
    zzC.showAtLocation(localView, 80, 0, 0);
    AppMethodBeat.o(107423);
  }

  private static int[] db(Context paramContext)
  {
    AppMethodBeat.i(107425);
    int[] arrayOfInt = new int[2];
    if ((paramContext instanceof Activity))
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((Activity)paramContext).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      arrayOfInt[0] = localDisplayMetrics.widthPixels;
      arrayOfInt[1] = localDisplayMetrics.heightPixels;
    }
    while (true)
    {
      AppMethodBeat.o(107425);
      return arrayOfInt;
      paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
      arrayOfInt[0] = paramContext.getWidth();
      arrayOfInt[1] = paramContext.getHeight();
    }
  }

  public static void dismiss()
  {
    AppMethodBeat.i(107424);
    if (zzB != null)
    {
      zzB.setAnimationStyle(-1);
      zzB.dismiss();
      zzB = null;
    }
    if (zzC != null)
    {
      zzC.setAnimationStyle(-1);
      zzC.dismiss();
      zzC = null;
    }
    AppMethodBeat.o(107424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.g.a
 * JD-Core Version:    0.6.2
 */