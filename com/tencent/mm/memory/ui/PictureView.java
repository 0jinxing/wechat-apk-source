package com.tencent.mm.memory.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.b.a;
import com.tencent.mm.memory.i;
import com.tencent.mm.memory.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public class PictureView extends ImageView
{
  private boolean DEBUG;
  private i feT;
  private boolean feU;
  private Runnable feV;

  public PictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(115484);
    this.DEBUG = false;
    this.feT = null;
    this.feU = false;
    this.feV = new PictureView.1(this);
    AppMethodBeat.o(115484);
  }

  public PictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(115485);
    this.DEBUG = false;
    this.feT = null;
    this.feU = false;
    this.feV = new PictureView.1(this);
    AppMethodBeat.o(115485);
  }

  private void Xy()
  {
    AppMethodBeat.i(115491);
    removeCallbacks(this.feV);
    if (this.DEBUG)
      ab.i("MicroMsg.PictureView", "onAttach" + hashCode() + " " + bo.dpG().toString());
    if (this.feU)
      AppMethodBeat.o(115491);
    while (true)
    {
      return;
      this.feU = true;
      AppMethodBeat.o(115491);
    }
  }

  private static String aZ(Object paramObject)
  {
    AppMethodBeat.i(115486);
    if (paramObject == null)
    {
      paramObject = "NULL";
      AppMethodBeat.o(115486);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof a))
      {
        paramObject = paramObject + " hashcode " + paramObject.hashCode() + " " + ((a)paramObject).Xx() + " " + ((a)paramObject).Xx().hashCode();
        AppMethodBeat.o(115486);
      }
      else
      {
        paramObject = String.valueOf(paramObject);
        AppMethodBeat.o(115486);
      }
    }
  }

  private static void ba(Object paramObject)
  {
    AppMethodBeat.i(115489);
    if ((paramObject != null) && ((paramObject instanceof i)))
      ((i)paramObject).Xd();
    AppMethodBeat.o(115489);
  }

  private static void bb(Object paramObject)
  {
    AppMethodBeat.i(115490);
    if ((paramObject != null) && ((paramObject instanceof i)))
      ((i)paramObject).Xe();
    AppMethodBeat.o(115490);
  }

  private void onDetach()
  {
    AppMethodBeat.i(115492);
    if (this.DEBUG)
      ab.i("MicroMsg.PictureView", "onDetach " + hashCode() + " " + bo.dpG().toString());
    if (!this.feU)
      AppMethodBeat.o(115492);
    while (true)
    {
      return;
      this.feU = false;
      removeCallbacks(this.feV);
      postDelayed(this.feV, 500L);
      AppMethodBeat.o(115492);
    }
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(115493);
    super.onAttachedToWindow();
    Xy();
    AppMethodBeat.o(115493);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(115494);
    super.onDetachedFromWindow();
    onDetach();
    AppMethodBeat.o(115494);
  }

  public void onFinishTemporaryDetach()
  {
    AppMethodBeat.i(115496);
    super.onFinishTemporaryDetach();
    Xy();
    AppMethodBeat.o(115496);
  }

  public void onStartTemporaryDetach()
  {
    AppMethodBeat.i(115495);
    super.onStartTemporaryDetach();
    onDetach();
    AppMethodBeat.o(115495);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(115488);
    removeCallbacks(this.feV);
    if ((paramDrawable == null) || (paramDrawable.equals(this.feT)))
    {
      AppMethodBeat.o(115488);
      return;
    }
    if (this.DEBUG)
      ab.i("MicroMsg.PictureView", "setImageDrawable " + hashCode() + " old: " + aZ(this.feT) + " new:" + aZ(paramDrawable) + " " + bo.dpG().toString());
    bb(this.feT);
    if ((paramDrawable instanceof i));
    for (this.feT = ((i)paramDrawable); ; this.feT = null)
    {
      ba(paramDrawable);
      super.setImageDrawable(paramDrawable);
      AppMethodBeat.o(115488);
      break;
    }
  }

  public void setReleasableBitmap(n paramn)
  {
    AppMethodBeat.i(115487);
    if ((paramn == null) || (paramn.equals(this.feT)))
      AppMethodBeat.o(115487);
    while (true)
    {
      return;
      setImageBitmap(paramn.Xi());
      this.feT = paramn;
      ba(this.feT);
      AppMethodBeat.o(115487);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.ui.PictureView
 * JD-Core Version:    0.6.2
 */