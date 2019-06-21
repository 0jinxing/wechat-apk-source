package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class AnimImageView extends TextView
{
  private Context context;
  private boolean isRunning;
  private AlphaAnimation mhK;
  private AnimationDrawable mhL;
  private int type;
  private boolean ysk;
  private AnimationDrawable ysl;

  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(29999);
    this.isRunning = false;
    this.ysk = false;
    this.type = 1;
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(29999);
  }

  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(30000);
    this.isRunning = false;
    this.ysk = false;
    this.type = 1;
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(30000);
  }

  private void bvA()
  {
    AppMethodBeat.i(30001);
    this.mhK = new AlphaAnimation(0.1F, 1.0F);
    this.mhK.setDuration(1000L);
    this.mhK.setRepeatCount(-1);
    this.mhK.setRepeatMode(2);
    this.mhL = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(2131231074);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mhL.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(2131231075);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mhL.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(2131231076);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mhL.addFrame(localDrawable, 300);
    this.mhL.setOneShot(false);
    this.mhL.setVisible(true, true);
    this.ysl = new AnimationDrawable();
    localDrawable = getResources().getDrawable(2131231114);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.ysl.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(2131231115);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.ysl.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(2131231116);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.ysl.addFrame(localDrawable, 300);
    this.ysl.setOneShot(false);
    this.ysl.setVisible(true, true);
    AppMethodBeat.o(30001);
  }

  public final void ceT()
  {
    AppMethodBeat.i(29998);
    if ((this.mhK != null) && (this.mhK.isInitialized()))
      setAnimation(null);
    if ((this.type == 1) || (this.type == 2))
    {
      this.isRunning = false;
      setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      this.mhL.stop();
      this.ysl.stop();
    }
    AppMethodBeat.o(29998);
  }

  public final void dzr()
  {
    AppMethodBeat.i(29997);
    switch (this.type)
    {
    default:
      AppMethodBeat.o(29997);
    case 2:
    case 1:
      while (true)
      {
        label42: return;
        if (this.ysk)
          setBackgroundResource(2131689811);
        while (!this.isRunning)
        {
          this.isRunning = true;
          if (!this.ysk)
            break label118;
          setCompoundDrawablesWithIntrinsicBounds(this.mhL, null, null, null);
          this.mhL.stop();
          this.mhL.start();
          AppMethodBeat.o(29997);
          break label42;
          setBackgroundResource(2131689812);
        }
        label118: setCompoundDrawablesWithIntrinsicBounds(null, null, this.ysl, null);
        this.ysl.stop();
        this.ysl.start();
        AppMethodBeat.o(29997);
      }
    case 0:
    }
    if (this.ysk)
      setBackgroundDrawable(a.g(this.context, 2130838217));
    while (true)
    {
      setAnimation(this.mhK);
      this.mhK.startNow();
      break;
      setBackgroundDrawable(a.g(this.context, 2130838320));
    }
  }

  public int getBaseline()
  {
    AppMethodBeat.i(30004);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(30004);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(30004);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(30003);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(30003);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
        AppMethodBeat.o(30003);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(30002);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(30002);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(30002);
    }
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(30005);
    try
    {
      bool = super.onPreDraw();
      AppMethodBeat.o(30005);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(30005);
      }
    }
  }

  public void setFromGroup(boolean paramBoolean)
  {
  }

  public void setFromVoice(boolean paramBoolean)
  {
    this.ysk = paramBoolean;
  }

  public void setType(int paramInt)
  {
    AppMethodBeat.i(29996);
    this.type = paramInt;
    if (this.ysk)
      if (paramInt == 2)
      {
        setBackgroundResource(2131689811);
        AppMethodBeat.o(29996);
      }
    while (true)
    {
      return;
      setBackgroundDrawable(a.g(this.context, 2130838217));
      AppMethodBeat.o(29996);
      continue;
      if (paramInt == 2)
      {
        setBackgroundResource(2131689812);
        AppMethodBeat.o(29996);
      }
      else
      {
        setBackgroundDrawable(a.g(this.context, 2130838320));
        AppMethodBeat.o(29996);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.AnimImageView
 * JD-Core Version:    0.6.2
 */