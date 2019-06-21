package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class LayoutListenerView extends FrameLayout
{
  private String TAG;
  private byte[] ykP;
  private a ykQ;
  private c ykR;
  private b ykS;

  public LayoutListenerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105976);
    this.TAG = "MicroMsg.LayoutListenerView";
    this.ykP = new byte[0];
    AppMethodBeat.o(105976);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(105982);
    synchronized (this.ykP)
    {
      this.ykQ = null;
      this.ykR = null;
      this.ykS = null;
      super.onDetachedFromWindow();
      AppMethodBeat.o(105982);
      return;
    }
  }

  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(105981);
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    ab.d(this.TAG, "jacks onInitializeAccessibilityEvent");
    AppMethodBeat.o(105981);
  }

  @TargetApi(14)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AppMethodBeat.i(105979);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    ab.d(this.TAG, "jacks onInitializeAccessibilityNodeInfo");
    AppMethodBeat.o(105979);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105977);
    synchronized (this.ykP)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    AppMethodBeat.o(105977);
    throw localObject1;
    localObject2 = finally;
    AppMethodBeat.o(105977);
    throw localObject2;
  }

  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(105980);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    ab.d(this.TAG, "jacks onPopulateAccessibilityEvent");
    AppMethodBeat.o(105980);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105978);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    synchronized (this.ykP)
    {
      if (this.ykR != null)
        this.ykR.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(105978);
      return;
    }
  }

  public void setOnLayoutListener(a parama)
  {
    synchronized (this.ykP)
    {
      this.ykQ = parama;
      return;
    }
  }

  public void setOnPreLayoutListener(b paramb)
  {
    synchronized (this.ykP)
    {
      this.ykS = paramb;
      return;
    }
  }

  public void setOnResizedListener(c paramc)
  {
    synchronized (this.ykP)
    {
      this.ykR = paramc;
      return;
    }
  }

  public static abstract interface a
  {
  }

  public static abstract interface b
  {
  }

  public static abstract interface c
  {
    public abstract void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.LayoutListenerView
 * JD-Core Version:    0.6.2
 */