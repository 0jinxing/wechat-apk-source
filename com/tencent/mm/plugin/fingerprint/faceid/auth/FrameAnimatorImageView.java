package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

public class FrameAnimatorImageView extends ImageView
{
  private Runnable mqP;
  private DrawFilter mqQ;

  public FrameAnimatorImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(41355);
    this.mqP = null;
    this.mqQ = new PaintFlagsDrawFilter(0, 3);
    AppMethodBeat.o(41355);
  }

  public FrameAnimatorImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(41356);
    this.mqP = null;
    this.mqQ = new PaintFlagsDrawFilter(0, 3);
    AppMethodBeat.o(41356);
  }

  public final void a(int paramInt, FrameAnimatorImageView.a parama)
  {
    AppMethodBeat.i(41357);
    Object localObject = ah.getContext().getResources().getDrawable(paramInt);
    setImageDrawable((Drawable)localObject);
    if ((localObject instanceof AnimationDrawable))
    {
      localObject = (AnimationDrawable)localObject;
      ((AnimationDrawable)localObject).start();
      if (((AnimationDrawable)localObject).isOneShot())
      {
        int i = 0;
        int j;
        for (paramInt = 0; i < ((AnimationDrawable)localObject).getNumberOfFrames(); paramInt = j + paramInt)
        {
          j = ((AnimationDrawable)localObject).getDuration(i);
          i++;
        }
        if (parama != null)
        {
          this.mqP = new FrameAnimatorImageView.1(this, parama);
          al.n(this.mqP, paramInt);
        }
      }
    }
    AppMethodBeat.o(41357);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(41361);
    paramCanvas.setDrawFilter(this.mqQ);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(41361);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(41360);
    al.af(this.mqP);
    super.setImageBitmap(paramBitmap);
    AppMethodBeat.o(41360);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(41358);
    al.af(this.mqP);
    super.setImageDrawable(paramDrawable);
    AppMethodBeat.o(41358);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(41359);
    al.af(this.mqP);
    super.setImageResource(paramInt);
    AppMethodBeat.o(41359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView
 * JD-Core Version:    0.6.2
 */