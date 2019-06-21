package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

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
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public class AdlandingSightPlayImageView extends QPictureView
{
  public e.a llE;
  private int qyC;
  private int qyD;
  private int qyE;
  private int qyF;
  public boolean qyG;
  private boolean qyH;
  private boolean qyI;
  b rcz;

  public AdlandingSightPlayImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AdlandingSightPlayImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(37439);
    this.qyG = true;
    this.qyH = false;
    this.qyI = false;
    this.rcz = new AdlandingSightPlayImageView.a(this);
    ab.i("MicroMsg.SightPlayImageView", "mController %s", new Object[] { bo.dpG().toString() });
    AppMethodBeat.o(37439);
  }

  public final void V(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37442);
    super.setImageBitmap(paramBitmap);
    AppMethodBeat.o(37442);
  }

  public final void bf(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37443);
    b localb = this.rcz;
    ab.i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", new Object[] { Integer.valueOf(localb.hashCode()), paramString, localb.ien, Boolean.valueOf(paramBoolean), Integer.valueOf(localb.qxo), Boolean.valueOf(localb.qxR), Boolean.valueOf(localb.qxI) });
    if (localb.qxR)
    {
      localb.kz(false);
      AppMethodBeat.o(37443);
    }
    while (true)
    {
      return;
      if (localb.clb())
      {
        ab.e("MicroMsg.SightPlayController", "is bad fps, do nothing when set video path");
        localb.clear();
        AppMethodBeat.o(37443);
      }
      else if (!localb.qxI)
      {
        localb.clear();
        AppMethodBeat.o(37443);
      }
      else if (paramBoolean)
      {
        localb.qxn = paramString;
        localb.kz(false);
        AppMethodBeat.o(37443);
      }
      else if (localb.ien.equals(paramString))
      {
        localb.qxn = "ERROR#PATH";
        localb.kz(false);
        localb.restart();
        AppMethodBeat.o(37443);
      }
      else
      {
        localb.clear();
        String str = paramString;
        if (paramString == null)
          str = "";
        localb.ien = str;
        if (bo.isNullOrNil(localb.ien))
        {
          ab.w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
          localb.cpV();
          AppMethodBeat.o(37443);
        }
        else if (!b.WS(localb.ien))
        {
          ab.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
          localb.clear();
          AppMethodBeat.o(37443);
        }
        else
        {
          localb.rci = new b.h(localb, (byte)0);
          o.i(localb.rci, 0L);
          AppMethodBeat.o(37443);
        }
      }
    }
  }

  public b getController()
  {
    return this.rcz;
  }

  public int getDuration()
  {
    AppMethodBeat.i(37454);
    int i;
    if (this.rcz == null)
    {
      i = 0;
      AppMethodBeat.o(37454);
      return i;
    }
    b localb = this.rcz;
    if (localb.qxo == -1);
    for (double d = 0.0D; ; d = SightVideoJNI.getVideoDuration(localb.qxo))
    {
      i = (int)d;
      AppMethodBeat.o(37454);
      break;
    }
  }

  public Object getTagObject()
  {
    AppMethodBeat.i(37449);
    Object localObject = getTag();
    AppMethodBeat.o(37449);
    return localObject;
  }

  public Context getUIContext()
  {
    AppMethodBeat.i(37450);
    Context localContext = getContext();
    AppMethodBeat.o(37450);
    return localContext;
  }

  public String getVideoPath()
  {
    return this.rcz.ien;
  }

  public final void kA(boolean paramBoolean)
  {
    AppMethodBeat.i(37453);
    b localb = this.rcz;
    ab.i("MicroMsg.SightPlayController", "configure: need sound %B", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (localb.rck != null)
        break label87;
      localb.rck = new b.i(localb, (byte)0);
      AppMethodBeat.o(37453);
    }
    while (true)
    {
      return;
      if (localb.rck != null)
      {
        localb.rck.type = 0;
        o.i(localb.rck, 0L);
      }
      localb.rck = null;
      label87: AppMethodBeat.o(37453);
    }
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(37445);
    ab.d("MicroMsg.SightPlayImageView", "#0x%x on attached from window", new Object[] { Integer.valueOf(hashCode()) });
    super.onAttachedToWindow();
    a.xxA.c(this.rcz.cld());
    AppMethodBeat.o(37445);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(37444);
    super.onDetachedFromWindow();
    ab.i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", new Object[] { Integer.valueOf(hashCode()) });
    this.rcz.clear();
    a.xxA.d(this.rcz.cld());
    AppMethodBeat.o(37444);
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(37455);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(37455);
  }

  public void setCanPlay(boolean paramBoolean)
  {
    this.rcz.qxI = paramBoolean;
  }

  public void setDrawableWidth(int paramInt)
  {
    AppMethodBeat.i(37446);
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
    AppMethodBeat.o(37446);
  }

  public void setForceRecordState(boolean paramBoolean)
  {
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37440);
    super.setImageBitmap(paramBitmap);
    if (this.qyI)
    {
      AppMethodBeat.o(37440);
      return;
    }
    int i;
    label40: int j;
    if (paramBitmap == null)
      if (this.qyD == 0)
      {
        i = 240;
        if (paramBitmap != null)
          break label145;
        if (this.qyC != 0)
          break label137;
        j = 320;
      }
    while (true)
    {
      paramBitmap = getLayoutParams();
      if (paramBitmap.height != this.qyC * i / j)
      {
        paramBitmap.width = this.qyC;
        float f = this.qyC;
        paramBitmap.height = ((int)(i * f / j));
        setLayoutParams(paramBitmap);
      }
      AppMethodBeat.o(37440);
      break;
      i = this.qyD;
      break label40;
      i = paramBitmap.getHeight();
      break label40;
      label137: j = this.qyC;
      continue;
      label145: j = paramBitmap.getWidth();
    }
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(37441);
    super.setImageDrawable(paramDrawable);
    if (this.qyI)
    {
      AppMethodBeat.o(37441);
      return;
    }
    int i;
    label40: int j;
    if (paramDrawable == null)
      if (this.qyD == 0)
      {
        i = 240;
        if (paramDrawable != null)
          break label154;
        if (this.qyC != 0)
          break label146;
        j = 320;
      }
    while (true)
    {
      if ((i != 0) && (j != 0))
      {
        paramDrawable = getLayoutParams();
        if (paramDrawable.height != this.qyC * i / j)
        {
          paramDrawable.width = this.qyC;
          float f = this.qyC;
          paramDrawable.height = ((int)(i * f / j));
          setLayoutParams(paramDrawable);
        }
      }
      AppMethodBeat.o(37441);
      break;
      i = this.qyD;
      break label40;
      i = paramDrawable.getIntrinsicHeight();
      break label40;
      label146: j = this.qyC;
      continue;
      label154: j = paramDrawable.getIntrinsicWidth();
    }
  }

  public void setIsWhatsNew(boolean paramBoolean)
  {
    this.rcz.qxL = paramBoolean;
  }

  public void setLoopImp(boolean paramBoolean)
  {
    if (this.rcz != null)
      this.rcz.fVc = paramBoolean;
  }

  public void setMaskID(int paramInt)
  {
  }

  public void setOnCompletionListener(b.e parame)
  {
    this.rcz.rcq = parame;
  }

  public void setOnDecodeDurationListener(b.f paramf)
  {
    this.rcz.rcr = paramf;
  }

  public void setOnSightCompletionAction(b.g paramg)
  {
    this.rcz.rcs = paramg;
  }

  public void setPosition(int paramInt)
  {
    this.rcz.position = paramInt;
  }

  public void setSightInfoView(TextView paramTextView)
  {
    AppMethodBeat.i(37452);
    this.rcz.qxv = new WeakReference(paramTextView);
    AppMethodBeat.o(37452);
  }

  public void setTagObject(Object paramObject)
  {
    AppMethodBeat.i(37448);
    setTag(paramObject);
    AppMethodBeat.o(37448);
  }

  public void setThumbBgView(View paramView)
  {
    AppMethodBeat.i(37451);
    this.rcz.qxu = new WeakReference(paramView);
    AppMethodBeat.o(37451);
  }

  public void setThumbBmp(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37447);
    setImageBitmap(paramBitmap);
    AppMethodBeat.o(37447);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView
 * JD-Core Version:    0.6.2
 */