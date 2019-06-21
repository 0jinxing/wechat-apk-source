package com.tencent.mm.pluginsdk.ui.websearch;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout;
import com.tencent.mm.pluginsdk.ui.VoiceInputLayout.a;
import com.tencent.mm.pluginsdk.ui.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

@TargetApi(16)
public class WebSearchVoiceInputLayoutImpl extends VoiceInputLayout
{
  private View.OnLongClickListener aKe;
  private View mMU;
  private boolean mMX;
  private long mMZ;
  private View.OnTouchListener mNa;
  private k vju;

  public WebSearchVoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(28229);
    this.mMX = false;
    this.aKe = new WebSearchVoiceInputLayoutImpl.1(this);
    this.mNa = new WebSearchVoiceInputLayoutImpl.2(this);
    init(paramContext);
    AppMethodBeat.o(28229);
  }

  public WebSearchVoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28228);
    this.mMX = false;
    this.aKe = new WebSearchVoiceInputLayoutImpl.1(this);
    this.mNa = new WebSearchVoiceInputLayoutImpl.2(this);
    init(paramContext);
    AppMethodBeat.o(28228);
  }

  private void bBJ()
  {
    AppMethodBeat.i(28232);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(28223);
        WebSearchVoiceInputLayoutImpl.b(WebSearchVoiceInputLayoutImpl.this).djo();
        AppMethodBeat.o(28223);
      }
    });
    bBR();
    AppMethodBeat.o(28232);
  }

  private static boolean bBL()
  {
    AppMethodBeat.i(28233);
    int i = aw.Rg().acS();
    boolean bool;
    if ((i == 4) || (i == 6))
    {
      bool = true;
      AppMethodBeat.o(28233);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(28233);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(28230);
    this.mMU = inflate(paramContext, 2130971010, this).findViewById(2131824276);
    this.mMU.setLayerType(1, null);
    this.vju = new k(paramContext);
    this.mMU.setBackground(this.vju);
    this.mMU.setEnabled(true);
    this.mMU.setOnTouchListener(this.mNa);
    this.mMU.setOnLongClickListener(this.aKe);
    reset(true);
    if (isInEditMode())
      AppMethodBeat.o(28230);
    while (true)
    {
      return;
      if (!bBL())
        bBJ();
      AppMethodBeat.o(28230);
    }
  }

  private static void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(28238);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      al.d(paramRunnable);
      AppMethodBeat.o(28238);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(28238);
    }
  }

  public final void B(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(28231);
    ab.d("MicroMsg.WebSearchVoiceInputLayoutImpl", "directStart currentState = %s longUp = %s clickUp = %s", new Object[] { Integer.valueOf(this.currentState), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (this.currentState == 1)
      if ((!paramBoolean1) && (!paramBoolean2))
        if (!bBL())
        {
          bBJ();
          AppMethodBeat.o(28231);
        }
    while (true)
    {
      return;
      bBO();
      AppMethodBeat.o(28231);
      continue;
      if ((paramBoolean1) && (!paramBoolean2))
      {
        this.vju.bBx();
        AppMethodBeat.o(28231);
        continue;
        if (this.currentState == 2)
        {
          if (!paramBoolean2)
          {
            bBP();
            AppMethodBeat.o(28231);
          }
          else
          {
            this.vju.bBx();
            amA();
            if (this.vjs != null)
            {
              this.vjs.bBI();
              AppMethodBeat.o(28231);
            }
          }
        }
        else if ((!paramBoolean1) && (!paramBoolean2))
        {
          amA();
          AppMethodBeat.o(28231);
        }
        else if ((paramBoolean1) && (!paramBoolean2))
        {
          this.vju.bBx();
        }
      }
      else
      {
        AppMethodBeat.o(28231);
      }
    }
  }

  public final void bBM()
  {
    AppMethodBeat.i(28234);
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.4(this));
    AppMethodBeat.o(28234);
  }

  public final void dX(boolean paramBoolean)
  {
    AppMethodBeat.i(28235);
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.5(this));
    AppMethodBeat.o(28235);
  }

  public final void onReset()
  {
    AppMethodBeat.i(28236);
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.6(this));
    AppMethodBeat.o(28236);
  }

  public final void wj(int paramInt)
  {
    AppMethodBeat.i(28237);
    runOnUiThread(new WebSearchVoiceInputLayoutImpl.7(this, paramInt));
    AppMethodBeat.o(28237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputLayoutImpl
 * JD-Core Version:    0.6.2
 */