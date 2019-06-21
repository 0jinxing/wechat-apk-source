package com.tencent.mm.plugin.appbrand.game.page;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class WAGamePageViewContainerLayout extends FrameLayout
{
  private WAGamePageViewContainerLayout.b hsY = null;
  private WAGamePageViewContainerLayout.a hsZ = null;

  public WAGamePageViewContainerLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public WAGamePageViewContainerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public WAGamePageViewContainerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(130278);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    WAGamePageViewContainerLayout.b localb;
    if ((getContext() instanceof Activity))
    {
      paramInt1 = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getRotation();
      switch (paramInt1)
      {
      default:
        ab.e("MicroMsg.WAContainerView", "hy: invalid rotate: %d!", new Object[] { Integer.valueOf(paramInt1) });
        localb = WAGamePageViewContainerLayout.b.hta;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      if (this.hsZ != null)
        this.hsZ.a(this.hsY, localb);
      this.hsY = localb;
      AppMethodBeat.o(130278);
      return;
      localb = WAGamePageViewContainerLayout.b.htb;
      continue;
      localb = WAGamePageViewContainerLayout.b.htc;
      continue;
      localb = WAGamePageViewContainerLayout.b.htd;
      continue;
      localb = WAGamePageViewContainerLayout.b.hte;
    }
  }

  public void setOnConfigurationChangedListener(WAGamePageViewContainerLayout.a parama)
  {
    this.hsZ = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.page.WAGamePageViewContainerLayout
 * JD-Core Version:    0.6.2
 */