package com.tencent.mm.plugin.fts.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;

@TargetApi(16)
public class FTSVoiceInputLayoutImpl extends VoiceInputLayout
{
  private View.OnLongClickListener aKe;
  private View mMU;
  private TextView mMV;
  private b mMW;
  private boolean mMX;
  private boolean mMY;
  private long mMZ;
  private View.OnTouchListener mNa;

  public FTSVoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62190);
    this.mMX = false;
    this.mMY = false;
    this.aKe = new FTSVoiceInputLayoutImpl.2(this);
    this.mNa = new FTSVoiceInputLayoutImpl.3(this);
    init(paramContext);
    AppMethodBeat.o(62190);
  }

  public FTSVoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62189);
    this.mMX = false;
    this.mMY = false;
    this.aKe = new FTSVoiceInputLayoutImpl.2(this);
    this.mNa = new FTSVoiceInputLayoutImpl.3(this);
    init(paramContext);
    AppMethodBeat.o(62189);
  }

  private void bBJ()
  {
    AppMethodBeat.i(62194);
    runOnUiThread(new FTSVoiceInputLayoutImpl.4(this));
    bBR();
    AppMethodBeat.o(62194);
  }

  private static boolean bBK()
  {
    AppMethodBeat.i(62195);
    int i = g.Rg().acS();
    boolean bool;
    if ((i == 4) || (i == 6))
    {
      bool = true;
      AppMethodBeat.o(62195);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62195);
    }
  }

  private static boolean bBL()
  {
    AppMethodBeat.i(62196);
    boolean bool;
    if (((h)g.RM().Rn()).SG())
    {
      bool = bBK();
      AppMethodBeat.o(62196);
    }
    while (true)
    {
      return bool;
      if (at.isConnected(ah.getContext()));
      for (int i = 6; ; i = 0)
      {
        if (i != 6)
          break label64;
        bool = true;
        AppMethodBeat.o(62196);
        break;
      }
      label64: AppMethodBeat.o(62196);
      bool = false;
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(62191);
    View localView = inflate(paramContext, 2130969640, this);
    this.mMU = localView.findViewById(2131824276);
    this.mMU.setLayerType(1, null);
    this.mMW = new b(paramContext);
    this.mMU.setBackground(this.mMW);
    this.mMU.setEnabled(true);
    this.mMU.setOnTouchListener(this.mNa);
    this.mMU.setOnLongClickListener(this.aKe);
    this.mMV = ((TextView)localView.findViewById(2131824277));
    reset(true);
    if (isInEditMode())
      AppMethodBeat.o(62191);
    while (true)
    {
      return;
      if (!bBL())
        bBJ();
      AppMethodBeat.o(62191);
    }
  }

  private static void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(62201);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      al.d(paramRunnable);
      AppMethodBeat.o(62201);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(62201);
    }
  }

  public final void B(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(62193);
    ab.d("MicroMsg.FTSVoiceInputLayoutImpl", "directStart currentState = %s longUp = %s clickUp = %s", new Object[] { Integer.valueOf(this.currentState), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (this.currentState == 1)
      if ((!paramBoolean1) && (!paramBoolean2))
      {
        bBO();
        AppMethodBeat.o(62193);
      }
    while (true)
    {
      return;
      if ((paramBoolean1) && (!paramBoolean2))
      {
        this.mMW.bBx();
        AppMethodBeat.o(62193);
        continue;
        if (this.currentState == 2)
        {
          if (!paramBoolean2)
          {
            bBP();
            AppMethodBeat.o(62193);
          }
          else
          {
            this.mMW.bBx();
            amA();
            if (this.mMQ != null)
            {
              this.mMQ.bBI();
              AppMethodBeat.o(62193);
            }
          }
        }
        else if ((!paramBoolean1) && (!paramBoolean2))
        {
          amA();
          AppMethodBeat.o(62193);
        }
        else if ((paramBoolean1) && (!paramBoolean2))
        {
          this.mMW.bBx();
        }
      }
      else
      {
        AppMethodBeat.o(62193);
      }
    }
  }

  protected final void bBM()
  {
    AppMethodBeat.i(62197);
    runOnUiThread(new FTSVoiceInputLayoutImpl.5(this));
    AppMethodBeat.o(62197);
  }

  protected final void bBN()
  {
    AppMethodBeat.i(62198);
    runOnUiThread(new FTSVoiceInputLayoutImpl.6(this));
    AppMethodBeat.o(62198);
  }

  protected final void onReset()
  {
    AppMethodBeat.i(62199);
    runOnUiThread(new FTSVoiceInputLayoutImpl.7(this));
    AppMethodBeat.o(62199);
  }

  public void setFTSVoiceDetectListener(a parama)
  {
    AppMethodBeat.i(62192);
    super.setVoiceDetectListener(parama);
    AppMethodBeat.o(62192);
  }

  protected final void wj(final int paramInt)
  {
    AppMethodBeat.i(62200);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(62188);
        b localb = FTSVoiceInputLayoutImpl.b(FTSVoiceInputLayoutImpl.this);
        int i = paramInt;
        ab.d("MicroMsg.FTSVoiceInputDrawable", "recordingState() called with: maxAmplitudeRate = [%s]", new Object[] { Integer.valueOf(i) });
        localb.mMC = b.wh(i);
        localb.invalidateSelf();
        localb.mME = i;
        AppMethodBeat.o(62188);
      }
    });
    AppMethodBeat.o(62200);
  }

  public static abstract interface a extends VoiceInputLayout.b
  {
    public abstract void bBA();

    public abstract void bBB();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl
 * JD-Core Version:    0.6.2
 */