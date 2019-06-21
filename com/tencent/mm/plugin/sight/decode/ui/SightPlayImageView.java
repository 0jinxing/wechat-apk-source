package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.ui.QPictureView;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.a.b.g;
import com.tencent.mm.plugin.sight.decode.a.b.i;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public class SightPlayImageView extends QPictureView
  implements com.tencent.mm.plugin.sight.decode.a.a
{
  public e.a llE;
  public b qyA;
  private int qyC;
  private int qyD;
  private int qyE;
  private int qyF;
  public boolean qyG;
  private boolean qyH;
  public boolean qyI;

  public SightPlayImageView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public SightPlayImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SightPlayImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(70256);
    this.qyG = true;
    this.qyH = false;
    this.qyI = false;
    this.qyA = new SightPlayImageView.a(this);
    ab.i("MicroMsg.SightPlayImageView", "mController %s", new Object[] { bo.dpG().toString() });
    AppMethodBeat.o(70256);
  }

  public final void V(Bitmap paramBitmap)
  {
    AppMethodBeat.i(70259);
    super.setImageBitmap(paramBitmap);
    AppMethodBeat.o(70259);
  }

  public final void bf(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(70261);
    this.qyA.bf(paramString, paramBoolean);
    AppMethodBeat.o(70261);
  }

  public final void ckX()
  {
    AppMethodBeat.i(70267);
    setImageBitmap(null);
    setImageResource(2130839707);
    AppMethodBeat.o(70267);
  }

  public final boolean ckY()
  {
    AppMethodBeat.i(70262);
    boolean bool = this.qyA.clb();
    AppMethodBeat.o(70262);
    return bool;
  }

  public final void clear()
  {
    AppMethodBeat.i(70260);
    this.qyA.clear();
    AppMethodBeat.o(70260);
  }

  public void fi(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70271);
    this.qyG = false;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    this.qyC = paramInt1;
    this.qyD = (this.qyC * paramInt2 / paramInt1);
    localLayoutParams.width = this.qyC;
    localLayoutParams.height = this.qyD;
    setLayoutParams(localLayoutParams);
    postInvalidate();
    AppMethodBeat.o(70271);
  }

  public b getController()
  {
    return this.qyA;
  }

  public int getDuration()
  {
    AppMethodBeat.i(70275);
    int i;
    if (this.qyA == null)
    {
      i = 0;
      AppMethodBeat.o(70275);
    }
    while (true)
    {
      return i;
      i = (int)this.qyA.cle();
      AppMethodBeat.o(70275);
    }
  }

  public Object getTagObject()
  {
    AppMethodBeat.i(70269);
    Object localObject = getTag();
    AppMethodBeat.o(70269);
    return localObject;
  }

  public Context getUIContext()
  {
    AppMethodBeat.i(70270);
    Context localContext = getContext();
    AppMethodBeat.o(70270);
    return localContext;
  }

  public String getVideoPath()
  {
    return this.qyA.ien;
  }

  public final void kA(boolean paramBoolean)
  {
    AppMethodBeat.i(70274);
    b localb = this.qyA;
    ab.i("MicroMsg.SightPlayController", "configure: need sound %B", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (localb.qxC != null)
        break label87;
      localb.qxC = new b.i(localb, (byte)0);
      AppMethodBeat.o(70274);
    }
    while (true)
    {
      return;
      if (localb.qxC != null)
      {
        localb.qxC.type = 0;
        o.i(localb.qxC, 0L);
      }
      localb.qxC = null;
      label87: AppMethodBeat.o(70274);
    }
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(70264);
    ab.d("MicroMsg.SightPlayImageView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    com.tencent.mm.sdk.b.a.xxA.c(this.qyA.cld());
    AppMethodBeat.o(70264);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(70263);
    super.onDetachedFromWindow();
    ab.i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.qyA.clear();
    com.tencent.mm.sdk.b.a.xxA.d(this.qyA.cld());
    AppMethodBeat.o(70263);
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(70276);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(70276);
  }

  public void setCanPlay(boolean paramBoolean)
  {
    this.qyA.qxI = paramBoolean;
  }

  public void setDrawableWidth(int paramInt)
  {
    AppMethodBeat.i(70265);
    this.qyG = false;
    this.qyC = paramInt;
    if ((this.qyE > 0) && (this.qyF > 0))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      this.qyD = (this.qyC * this.qyF / this.qyE);
      if ((localLayoutParams.width != this.qyC) || (localLayoutParams.height != this.qyD))
      {
        localLayoutParams.width = this.qyC;
        localLayoutParams.height = this.qyD;
        setLayoutParams(localLayoutParams);
      }
    }
    AppMethodBeat.o(70265);
  }

  public void setForceRecordState(boolean paramBoolean)
  {
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(70257);
    super.setImageBitmap(paramBitmap);
    if (this.qyI)
    {
      AppMethodBeat.o(70257);
      return;
    }
    int i;
    label38: int j;
    if (paramBitmap == null)
      if (this.qyD == 0)
      {
        i = 240;
        if (paramBitmap != null)
          break label141;
        if (this.qyC != 0)
          break label133;
        j = 320;
      }
    while (true)
    {
      paramBitmap = getLayoutParams();
      if (paramBitmap.height != (int)(this.qyC * i / j))
      {
        paramBitmap.width = this.qyC;
        float f = this.qyC;
        paramBitmap.height = ((int)(i * f / j));
        setLayoutParams(paramBitmap);
      }
      AppMethodBeat.o(70257);
      break;
      i = this.qyD;
      break label38;
      i = paramBitmap.getHeight();
      break label38;
      label133: j = this.qyC;
      continue;
      label141: j = paramBitmap.getWidth();
    }
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(70258);
    super.setImageDrawable(paramDrawable);
    if (this.qyI)
    {
      AppMethodBeat.o(70258);
      return;
    }
    int i;
    label40: int j;
    if (paramDrawable == null)
      if (this.qyD == 0)
      {
        i = 240;
        if (paramDrawable != null)
          break label153;
        if (this.qyC != 0)
          break label145;
        j = 320;
      }
    while (true)
    {
      if ((i != 0) && (j != 0))
      {
        paramDrawable = getLayoutParams();
        if (paramDrawable.height != (int)(this.qyC * i / j))
        {
          paramDrawable.width = this.qyC;
          float f = this.qyC;
          paramDrawable.height = ((int)(i * f / j));
          setLayoutParams(paramDrawable);
        }
      }
      AppMethodBeat.o(70258);
      break;
      i = this.qyD;
      break label40;
      i = paramDrawable.getIntrinsicHeight();
      break label40;
      label145: j = this.qyC;
      continue;
      label153: j = paramDrawable.getIntrinsicWidth();
    }
  }

  public void setIsWhatsNew(boolean paramBoolean)
  {
    this.qyA.qxL = paramBoolean;
  }

  public void setLoopImp(boolean paramBoolean)
  {
    if (this.qyA != null)
      this.qyA.fVc = paramBoolean;
  }

  public void setMaskID(int paramInt)
  {
  }

  public void setOnCompletionListener(b.e parame)
  {
    this.qyA.qxT = parame;
  }

  public void setOnDecodeDurationListener(b.f paramf)
  {
    this.qyA.qxU = paramf;
  }

  public void setOnSightCompletionAction(b.g paramg)
  {
    this.qyA.qxV = paramg;
  }

  public void setPosition(int paramInt)
  {
    this.qyA.position = paramInt;
  }

  public void setSightInfoView(TextView paramTextView)
  {
    AppMethodBeat.i(70273);
    this.qyA.setSightInfoView(paramTextView);
    AppMethodBeat.o(70273);
  }

  public void setTagObject(Object paramObject)
  {
    AppMethodBeat.i(70268);
    setTag(paramObject);
    AppMethodBeat.o(70268);
  }

  public void setThumbBgView(View paramView)
  {
    AppMethodBeat.i(70272);
    this.qyA.setThumbBgView(paramView);
    AppMethodBeat.o(70272);
  }

  public void setThumbBmp(Bitmap paramBitmap)
  {
    AppMethodBeat.i(70266);
    setImageBitmap(paramBitmap);
    AppMethodBeat.o(70266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView
 * JD-Core Version:    0.6.2
 */