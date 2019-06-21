package com.tencent.mm.modelvoiceaddr.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.modelvoiceaddr.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public class VoiceSearchLayout extends LinearLayout
{
  private static final int[] gcc = { 2130840593, 2130840594, 2130840595, 2130840596, 2130840573, 2130840574, 2130840575, 2130840576, 2130840577, 2130840578, 2130840579, 2130840580, 2130840581, 2130840582 };
  private static final int[] gcd = { 2130840593, 2130840593, 2130840593, 2130840594, 2130840595, 2130840594, 2130840593, 2130840596, 2130840593, 2130840593 };
  private static final int[] gce = { 2130840583, 2130840592, 2130840592, 2130840592, 2130840583 };
  boolean cFy;
  private int from;
  private View gbS;
  VoiceSearchLayout.a gbT;
  private Button gbU;
  boolean gbV;
  int gbW;
  private VoiceSearchLayout.b gbX;
  private View gbY;
  private AnimationDrawable gbZ;
  f gca;
  private boolean gcb;
  private int gcf;
  private int gcg;
  int gch;
  final ap gci;

  public VoiceSearchLayout(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(116771);
    this.gbS = null;
    this.gbT = null;
    this.cFy = false;
    this.gbV = false;
    this.gbW = 0;
    this.gcb = false;
    this.from = 0;
    this.gcf = 0;
    this.gcg = 0;
    this.gch = 0;
    this.gci = new ap(new VoiceSearchLayout.1(this), true);
    init(paramContext);
    AppMethodBeat.o(116771);
  }

  public VoiceSearchLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(116770);
    this.gbS = null;
    this.gbT = null;
    this.cFy = false;
    this.gbV = false;
    this.gbW = 0;
    this.gcb = false;
    this.from = 0;
    this.gcf = 0;
    this.gcg = 0;
    this.gch = 0;
    this.gci = new ap(new VoiceSearchLayout.1(this), true);
    init(paramContext);
    AppMethodBeat.o(116770);
  }

  @TargetApi(11)
  public VoiceSearchLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(116769);
    this.gbS = null;
    this.gbT = null;
    this.cFy = false;
    this.gbV = false;
    this.gbW = 0;
    this.gcb = false;
    this.from = 0;
    this.gcf = 0;
    this.gcg = 0;
    this.gch = 0;
    this.gci = new ap(new VoiceSearchLayout.1(this), true);
    init(paramContext);
    AppMethodBeat.o(116769);
  }

  private static void KY()
  {
    AppMethodBeat.i(116781);
    ab.d("MicroMsg.VoiceSearchLayout", "resumeMusic");
    g.KK().KY();
    AppMethodBeat.o(116781);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(116772);
    this.gbS = inflate(paramContext, 2130971022, this);
    this.gbU = ((Button)this.gbS.findViewById(2131824276));
    this.gbY = this.gbS.findViewById(2131828472);
    setSearchStartBtnView(false);
    reset();
    AppMethodBeat.o(116772);
  }

  private void setAmpImage(int paramInt)
  {
    AppMethodBeat.i(116779);
    if (this.gbU != null)
      this.gbU.setBackgroundResource(paramInt);
    AppMethodBeat.o(116779);
  }

  private void setSearchStartBtnView(boolean paramBoolean)
  {
    AppMethodBeat.i(116776);
    if (paramBoolean)
    {
      this.gbU.setBackgroundResource(2130840549);
      this.gbZ = ((AnimationDrawable)this.gbU.getBackground());
      if (this.gbZ == null)
        break label61;
      this.gbZ.start();
      AppMethodBeat.o(116776);
    }
    while (true)
    {
      return;
      this.gbU.setBackgroundResource(2130840571);
      label61: AppMethodBeat.o(116776);
    }
  }

  public final void amA()
  {
    AppMethodBeat.i(116774);
    ab.d("MicroMsg.VoiceSearchLayout", "doCancel " + this.cFy);
    if (this.cFy)
    {
      this.cFy = false;
      if (this.gbT != null)
        this.gbT.amF();
    }
    reset();
    if (getVisibility() == 0)
    {
      setVisibility(8);
      if (this.gbX != null)
        this.gbX.dd(false);
    }
    KY();
    if (this.gca != null)
      this.gca.cancel();
    if (this.gci != null)
      this.gci.stopTimer();
    AppMethodBeat.o(116774);
  }

  final void dc(boolean paramBoolean)
  {
    AppMethodBeat.i(116780);
    if (paramBoolean)
    {
      ab.d("MicroMsg.VoiceSearchLayout", "pauseMusic");
      g.KK().KX();
    }
    while (true)
    {
      k localk = new k();
      if (paramBoolean);
      try
      {
        Object localObject1 = getContext();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("android.resource://");
        localk.setDataSource((Context)localObject1, Uri.parse(getContext().getPackageName() + "/2131231777"));
        while (true)
        {
          localk.setAudioStreamType(5);
          localObject1 = new com/tencent/mm/modelvoiceaddr/ui/VoiceSearchLayout$2;
          ((VoiceSearchLayout.2)localObject1).<init>(this);
          localk.setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject1);
          localObject1 = new com/tencent/mm/modelvoiceaddr/ui/VoiceSearchLayout$3;
          ((VoiceSearchLayout.3)localObject1).<init>(this);
          localk.setOnErrorListener((MediaPlayer.OnErrorListener)localObject1);
          localk.prepare();
          localk.setLooping(false);
          localk.start();
          AppMethodBeat.o(116780);
          return;
          KY();
          break;
          localObject2 = getContext();
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("android.resource://");
          localk.setDataSource((Context)localObject2, Uri.parse(getContext().getPackageName() + "/2131231735"));
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.VoiceSearchLayout", localException, "", new Object[0]);
          localk.release();
          AppMethodBeat.o(116780);
        }
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116773);
    if (!this.gbV)
    {
      ab.d("MicroMsg.VoiceSearchLayout", "checkStop " + this.cFy);
      if (this.cFy)
      {
        amA();
        this.cFy = false;
      }
    }
    AppMethodBeat.o(116773);
    return true;
  }

  public final void reset()
  {
    AppMethodBeat.i(116775);
    setSearchStartBtnView(false);
    this.cFy = false;
    this.gbV = false;
    this.gbU.setBackgroundResource(2130840571);
    AppMethodBeat.o(116775);
  }

  public void setOnSearchListener(VoiceSearchLayout.a parama)
  {
    this.gbT = parama;
  }

  public void setOnVisibleChangeListener(VoiceSearchLayout.b paramb)
  {
    this.gbX = paramb;
  }

  public void setTopMargin(int paramInt)
  {
    AppMethodBeat.i(116778);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.gbY.getLayoutParams();
    localLayoutParams.topMargin = paramInt;
    this.gbY.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(116778);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(116777);
    Object localObject;
    if ((super.getVisibility() != paramInt) && (!this.gcb))
    {
      if (paramInt != 8)
        break label80;
      localObject = AnimationUtils.loadAnimation(getContext(), 2131034181);
      startAnimation((Animation)localObject);
      super.setVisibility(paramInt);
      if (this.gbX != null)
      {
        localObject = this.gbX;
        if (paramInt != 0)
          break label94;
      }
    }
    label80: label94: for (boolean bool = true; ; bool = false)
    {
      ((VoiceSearchLayout.b)localObject).dd(bool);
      AppMethodBeat.o(116777);
      return;
      localObject = AnimationUtils.loadAnimation(getContext(), 2131034180);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout
 * JD-Core Version:    0.6.2
 */