package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class BankRemitBaseUI extends WalletBaseUI
{
  public static int Y(Activity paramActivity)
  {
    int i = 0;
    int j = i;
    if (Build.VERSION.SDK_INT >= 19)
    {
      if (Build.VERSION.SDK_INT < 23)
        break label37;
      paramActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
      j = 3;
    }
    while (true)
    {
      return j;
      label37: if (Z(paramActivity))
      {
        j = 1;
      }
      else
      {
        j = i;
        if (d(paramActivity.getWindow()))
          j = 2;
      }
    }
  }

  private static boolean Z(Activity paramActivity)
  {
    boolean bool1 = true;
    Window localWindow = paramActivity.getWindow();
    Class localClass1;
    if (localWindow != null)
      localClass1 = localWindow.getClass();
    while (true)
    {
      try
      {
        Class localClass2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
        int i = localClass2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(localClass2);
        localClass1.getMethod("setExtraFlags", new Class[] { Integer.TYPE, Integer.TYPE }).invoke(localWindow, new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
        bool2 = bool1;
      }
      catch (Exception paramActivity)
      {
        try
        {
          if (Build.VERSION.SDK_INT >= 23)
          {
            paramActivity.getWindow().getDecorView().setSystemUiVisibility(8192);
            bool2 = bool1;
          }
          return bool2;
          paramActivity = paramActivity;
          bool2 = false;
          continue;
        }
        catch (Exception paramActivity)
        {
          bool2 = bool1;
          continue;
        }
      }
      boolean bool2 = false;
    }
  }

  private static boolean d(Window paramWindow)
  {
    boolean bool = true;
    if (paramWindow != null);
    while (true)
    {
      try
      {
        WindowManager.LayoutParams localLayoutParams = paramWindow.getAttributes();
        Field localField1 = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
        Field localField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
        localField1.setAccessible(true);
        localField2.setAccessible(true);
        localField2.setInt(localLayoutParams, localField1.getInt(null) | localField2.getInt(localLayoutParams));
        paramWindow.setAttributes(localLayoutParams);
        return bool;
      }
      catch (Exception paramWindow)
      {
      }
      bool = false;
    }
  }

  protected void bFY()
  {
    ab.i("BankRemitBase", "ret: %s", new Object[] { Integer.valueOf(Y(this)) });
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bFY();
    setBackBtn(new BankRemitBaseUI.1(this));
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI
 * JD-Core Version:    0.6.2
 */