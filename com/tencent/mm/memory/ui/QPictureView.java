package com.tencent.mm.memory.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.b.a;
import com.tencent.mm.memory.i;
import com.tencent.mm.memory.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.QImageView;

public class QPictureView extends QImageView
{
  private boolean DEBUG;
  private i feT;
  private boolean feU;
  private Runnable feV;

  public QPictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(115499);
    this.DEBUG = false;
    this.feT = null;
    this.feU = false;
    this.feV = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(115498);
        QPictureView.a(QPictureView.this);
        AppMethodBeat.o(115498);
      }
    };
    AppMethodBeat.o(115499);
  }

  public QPictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(115500);
    this.DEBUG = false;
    this.feT = null;
    this.feU = false;
    this.feV = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(115498);
        QPictureView.a(QPictureView.this);
        AppMethodBeat.o(115498);
      }
    };
    AppMethodBeat.o(115500);
  }

  private void Xy()
  {
    AppMethodBeat.i(115506);
    if (this.DEBUG)
      ab.i("MicroMsg.QPictureView", "onAttach" + hashCode() + " " + bo.dpG().toString());
    removeCallbacks(this.feV);
    if (this.feU)
      AppMethodBeat.o(115506);
    while (true)
    {
      return;
      this.feU = true;
      AppMethodBeat.o(115506);
    }
  }

  private static String aZ(Object paramObject)
  {
    AppMethodBeat.i(115501);
    if (paramObject == null)
    {
      paramObject = "NULL";
      AppMethodBeat.o(115501);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof a))
      {
        paramObject = paramObject + " hashcode " + paramObject.hashCode() + " " + ((a)paramObject).Xx() + " " + ((a)paramObject).Xx().hashCode();
        AppMethodBeat.o(115501);
      }
      else
      {
        paramObject = String.valueOf(paramObject);
        AppMethodBeat.o(115501);
      }
    }
  }

  private static void ba(Object paramObject)
  {
    AppMethodBeat.i(115504);
    if ((paramObject != null) && ((paramObject instanceof i)))
      ((i)paramObject).Xd();
    AppMethodBeat.o(115504);
  }

  private static void bb(Object paramObject)
  {
    AppMethodBeat.i(115505);
    if ((paramObject != null) && ((paramObject instanceof i)))
      ((i)paramObject).Xe();
    AppMethodBeat.o(115505);
  }

  private void onDetach()
  {
    AppMethodBeat.i(115507);
    if (this.DEBUG)
      ab.i("MicroMsg.QPictureView", "onDetach " + hashCode() + " " + bo.dpG().toString());
    if (!this.feU)
      AppMethodBeat.o(115507);
    while (true)
    {
      return;
      this.feU = false;
      removeCallbacks(this.feV);
      postDelayed(this.feV, 500L);
      AppMethodBeat.o(115507);
    }
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(115508);
    super.onAttachedToWindow();
    Xy();
    AppMethodBeat.o(115508);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(115509);
    super.onDetachedFromWindow();
    onDetach();
    AppMethodBeat.o(115509);
  }

  public void onFinishTemporaryDetach()
  {
    AppMethodBeat.i(115511);
    super.onFinishTemporaryDetach();
    Xy();
    AppMethodBeat.o(115511);
  }

  public void onStartTemporaryDetach()
  {
    AppMethodBeat.i(115510);
    super.onStartTemporaryDetach();
    onDetach();
    AppMethodBeat.o(115510);
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(115503);
    removeCallbacks(this.feV);
    if ((paramDrawable == null) || (paramDrawable.equals(this.feT)))
    {
      AppMethodBeat.o(115503);
      return;
    }
    if (this.DEBUG)
      ab.i("MicroMsg.QPictureView", "setImageDrawable " + hashCode() + " old: " + aZ(this.feT) + " new:" + aZ(paramDrawable) + " " + bo.dpG().toString());
    bb(this.feT);
    if ((paramDrawable instanceof i));
    for (this.feT = ((i)paramDrawable); ; this.feT = null)
    {
      ba(paramDrawable);
      super.setImageDrawable(paramDrawable);
      AppMethodBeat.o(115503);
      break;
    }
  }

  public void setReleasableBitmap(n paramn)
  {
    AppMethodBeat.i(115502);
    if ((paramn == null) || (paramn.equals(this.feT)))
      AppMethodBeat.o(115502);
    while (true)
    {
      return;
      setImageBitmap(paramn.Xi());
      this.feT = paramn;
      ba(this.feT);
      AppMethodBeat.o(115502);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.ui.QPictureView
 * JD-Core Version:    0.6.2
 */