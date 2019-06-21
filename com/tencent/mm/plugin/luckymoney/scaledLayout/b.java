package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.i;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class b
{
  protected final RecyclerView.i amP;
  private int amQ = -2147483648;
  final Rect oT = new Rect();

  private b(RecyclerView.i parami)
  {
    this.amP = parami;
  }

  public static b a(RecyclerView.i parami, int paramInt)
  {
    // Byte code:
    //   0: iload_1
    //   1: tableswitch	default:+23 -> 24, 0:+33->34, 1:+44->45
    //   25: nop
    //   26: fload_1
    //   27: dup
    //   28: ldc 37
    //   30: invokespecial 40	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   33: athrow
    //   34: new 6	com/tencent/mm/plugin/luckymoney/scaledLayout/b$1
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 41	com/tencent/mm/plugin/luckymoney/scaledLayout/b$1:<init>	(Landroid/support/v7/widget/RecyclerView$i;)V
    //   42: astore_0
    //   43: aload_0
    //   44: areturn
    //   45: new 43	com/tencent/mm/plugin/luckymoney/scaledLayout/b$2
    //   48: dup
    //   49: aload_0
    //   50: invokespecial 44	com/tencent/mm/plugin/luckymoney/scaledLayout/b$2:<init>	(Landroid/support/v7/widget/RecyclerView$i;)V
    //   53: astore_0
    //   54: goto -11 -> 43
  }

  public abstract int bLR();

  public abstract int bj(View paramView);

  public abstract int bk(View paramView);

  public abstract int je();

  public abstract int jg();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.b
 * JD-Core Version:    0.6.2
 */