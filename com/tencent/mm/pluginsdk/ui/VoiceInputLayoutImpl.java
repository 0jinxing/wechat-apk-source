package com.tencent.mm.pluginsdk.ui;

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
import com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.mm.plugin.report.kvdata.log_13905;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

@TargetApi(16)
public class VoiceInputLayoutImpl extends VoiceInputLayout
{
  private View.OnLongClickListener aKe;
  private View mMU;
  private boolean mMX;
  private long mMZ;
  private View.OnTouchListener mNa;
  private k vju;

  public VoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27594);
    this.mMX = false;
    this.aKe = new VoiceInputLayoutImpl.1(this);
    this.mNa = new VoiceInputLayoutImpl.2(this);
    init(paramContext);
    AppMethodBeat.o(27594);
  }

  public VoiceInputLayoutImpl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(27593);
    this.mMX = false;
    this.aKe = new VoiceInputLayoutImpl.1(this);
    this.mNa = new VoiceInputLayoutImpl.2(this);
    init(paramContext);
    AppMethodBeat.o(27593);
  }

  private void ay(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(27604);
    log_13905 locallog_13905 = new log_13905();
    VoiceInputBehavior localVoiceInputBehavior = new VoiceInputBehavior();
    if (paramBoolean)
      if (this.mNh)
      {
        localVoiceInputBehavior.fullScreenVoiceLongClick = paramInt;
        if ((paramInt != 4) && (this.mMX) && (this.mMZ != 0L))
          localVoiceInputBehavior.fullScreenVoiceLongClickTime = bo.az(this.mMZ);
      }
    while (true)
    {
      locallog_13905.viOp_ = localVoiceInputBehavior;
      h.pYm.c(13905, locallog_13905);
      ab.i("MicroMsg.VoiceInputLayoutImp", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", new Object[] { Integer.valueOf(localVoiceInputBehavior.cancel), Integer.valueOf(localVoiceInputBehavior.send), Integer.valueOf(localVoiceInputBehavior.click), Integer.valueOf(localVoiceInputBehavior.longClick), Long.valueOf(localVoiceInputBehavior.longClickTime), Integer.valueOf(localVoiceInputBehavior.textClick), Integer.valueOf(localVoiceInputBehavior.textChangeCount), Long.valueOf(localVoiceInputBehavior.textChangeTime), Integer.valueOf(localVoiceInputBehavior.textChangeReturn), Long.valueOf(localVoiceInputBehavior.voiceInputTime), Integer.valueOf(localVoiceInputBehavior.fail), Integer.valueOf(localVoiceInputBehavior.clear), Integer.valueOf(localVoiceInputBehavior.smileIconClick), Integer.valueOf(localVoiceInputBehavior.voiceIconClick), Integer.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(localVoiceInputBehavior.fullScreenVoiceLongClickTime) });
      AppMethodBeat.o(27604);
      return;
      localVoiceInputBehavior.longClick = paramInt;
      if ((paramInt != 4) && (this.mMX) && (this.mMZ != 0L))
      {
        localVoiceInputBehavior.longClickTime = bo.az(this.mMZ);
        continue;
        localVoiceInputBehavior.click = paramInt;
      }
    }
  }

  private void bBJ()
  {
    AppMethodBeat.i(27597);
    runOnUiThread(new VoiceInputLayoutImpl.3(this));
    bBR();
    AppMethodBeat.o(27597);
  }

  private static boolean bBL()
  {
    AppMethodBeat.i(27598);
    int i = aw.Rg().acS();
    boolean bool;
    if ((i == 4) || (i == 6))
    {
      bool = true;
      AppMethodBeat.o(27598);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27598);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(27595);
    this.mMU = inflate(paramContext, 2130971010, this).findViewById(2131824276);
    this.mMU.setLayerType(1, null);
    this.vju = new k(paramContext);
    this.mMU.setBackground(this.vju);
    this.mMU.setEnabled(true);
    this.mMU.setOnTouchListener(this.mNa);
    this.mMU.setOnLongClickListener(this.aKe);
    reset(true);
    if (isInEditMode())
      AppMethodBeat.o(27595);
    while (true)
    {
      return;
      if (!bBL())
        bBJ();
      AppMethodBeat.o(27595);
    }
  }

  private static void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(27603);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      al.d(paramRunnable);
      AppMethodBeat.o(27603);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(27603);
    }
  }

  public final void B(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(27596);
    ab.d("MicroMsg.VoiceInputLayoutImp", "directStart currentState = %s longUp = %s clickUp = %s", new Object[] { Integer.valueOf(this.currentState), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (this.currentState == 1)
      if ((!paramBoolean1) && (!paramBoolean2))
        if (!bBL())
        {
          bBJ();
          AppMethodBeat.o(27596);
        }
    while (true)
    {
      return;
      bBO();
      AppMethodBeat.o(27596);
      continue;
      if ((paramBoolean1) && (!paramBoolean2))
      {
        ay(4, this.mMX);
        ay(this.currentState, this.mMX);
        this.vju.bBx();
        AppMethodBeat.o(27596);
        continue;
        if (this.currentState == 2)
        {
          if (!paramBoolean2)
          {
            if (paramBoolean1)
              ay(4, this.mMX);
            ay(this.currentState, this.mMX);
            bBP();
            AppMethodBeat.o(27596);
          }
          else
          {
            this.vju.bBx();
            amA();
            if (this.vjs != null)
              this.vjs.bBI();
            ay(5, this.mMX);
            AppMethodBeat.o(27596);
          }
        }
        else if ((!paramBoolean1) && (!paramBoolean2))
        {
          ay(this.currentState, this.mMX);
          amA();
          AppMethodBeat.o(27596);
        }
        else if ((paramBoolean1) && (!paramBoolean2))
        {
          ay(4, this.mMX);
          ay(this.currentState, this.mMX);
          this.vju.bBx();
        }
      }
      else
      {
        AppMethodBeat.o(27596);
      }
    }
  }

  protected final void bBM()
  {
    AppMethodBeat.i(27599);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(27589);
        VoiceInputLayoutImpl.a(VoiceInputLayoutImpl.this).oy(this.mNc);
        AppMethodBeat.o(27589);
      }
    });
    AppMethodBeat.o(27599);
  }

  protected final void dX(boolean paramBoolean)
  {
    AppMethodBeat.i(27600);
    if (!paramBoolean)
      ay(17, false);
    runOnUiThread(new VoiceInputLayoutImpl.5(this));
    AppMethodBeat.o(27600);
  }

  protected final void onReset()
  {
    AppMethodBeat.i(27601);
    runOnUiThread(new VoiceInputLayoutImpl.6(this));
    AppMethodBeat.o(27601);
  }

  protected final void wj(int paramInt)
  {
    AppMethodBeat.i(27602);
    runOnUiThread(new VoiceInputLayoutImpl.7(this, paramInt));
    AppMethodBeat.o(27602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl
 * JD-Core Version:    0.6.2
 */