package com.tencent.mm.ui.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;

public final class a
{
  public Context Gn;
  Vibrator kgA;
  private AccessibilityManager mP;
  TextToSpeech yqU;
  private boolean yqV;
  private long yqW;

  public a(Context paramContext)
  {
    AppMethodBeat.i(106134);
    this.yqU = null;
    this.Gn = paramContext;
    this.mP = ((AccessibilityManager)this.Gn.getSystemService("accessibility"));
    AppMethodBeat.o(106134);
  }

  public final void a(View paramView, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(106137);
    if (!dzj())
      AppMethodBeat.o(106137);
    while (true)
    {
      return;
      if ((this.Gn == null) || (paramView == null))
      {
        AppMethodBeat.o(106137);
      }
      else if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null))
      {
        AppMethodBeat.o(106137);
      }
      else
      {
        b localb = new b();
        localb.aqI(paramString1);
        if (paramInt > 0)
          localb.aqI(this.Gn.getResources().getQuantityString(2131361796, 1, new Object[] { Integer.valueOf(paramInt) }));
        localb.aqI(paramString2).aqI(paramString3);
        localb.eD(paramView);
        AppMethodBeat.o(106137);
      }
    }
  }

  public final void a(View paramView, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(106136);
    if (!dzj())
      AppMethodBeat.o(106136);
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(paramString1)) && (this.Gn != null))
        break;
      AppMethodBeat.o(106136);
    }
    b localb = new b();
    localb.aqI(paramString1);
    if (!bo.isNullOrNil(paramString2));
    while (true)
    {
      try
      {
        i = bo.getInt(paramString2, 0);
        if (i > 0)
        {
          if (i > 0)
            localb.aqI(this.Gn.getResources().getQuantityString(2131361823, 1, new Object[] { Integer.valueOf(i) }));
          localb.aqI(this.Gn.getResources().getQuantityString(2131361824, 5, new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt + 1) }));
          localb.eD(paramView);
          AppMethodBeat.o(106136);
        }
      }
      catch (Exception paramString1)
      {
      }
      int i = 0;
    }
  }

  public final void ah(View paramView, int paramInt)
  {
    AppMethodBeat.i(106138);
    if (!dzj())
      AppMethodBeat.o(106138);
    while (true)
    {
      return;
      if ((this.Gn == null) || (paramView == null))
      {
        AppMethodBeat.o(106138);
      }
      else
      {
        paramInt = Math.max(paramInt, 1);
        b localb = new b();
        localb.aqI(this.Gn.getResources().getQuantityString(2131361795, paramInt, new Object[] { Integer.valueOf(paramInt) }));
        localb.eD(paramView);
        AppMethodBeat.o(106138);
      }
    }
  }

  public final boolean dzj()
  {
    AppMethodBeat.i(106135);
    if (SystemClock.uptimeMillis() - this.yqW > 2000L)
    {
      boolean bool1 = this.mP.isEnabled();
      bool2 = this.mP.isTouchExplorationEnabled();
      if ((!bool1) || (!bool2))
        break label70;
    }
    label70: for (boolean bool2 = true; ; bool2 = false)
    {
      this.yqV = bool2;
      this.yqW = SystemClock.uptimeMillis();
      bool2 = this.yqV;
      AppMethodBeat.o(106135);
      return bool2;
    }
  }

  public final void h(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(106139);
    if (dzj())
      AppMethodBeat.o(106139);
    while (true)
    {
      return;
      if ((bo.isNullOrNil(paramString)) || (paramActivity == null))
      {
        AppMethodBeat.o(106139);
      }
      else
      {
        paramString = paramActivity.getString(2131298412) + paramString;
        paramActivity.getWindow().getDecorView().setContentDescription(paramString);
        AppMethodBeat.o(106139);
      }
    }
  }

  public static final class a
  {
    private static final a yqY;

    static
    {
      AppMethodBeat.i(106133);
      yqY = new a(ah.getContext());
      AppMethodBeat.o(106133);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a.a
 * JD-Core Version:    0.6.2
 */