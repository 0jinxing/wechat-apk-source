package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMKeyboardUperView extends ScrollView
{
  private int defaultHeight;
  private View gDh;
  private Runnable gDi;
  private Runnable gDj;

  public MMKeyboardUperView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(125080);
    this.defaultHeight = -1;
    this.gDi = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(125077);
        MMKeyboardUperView.this.fullScroll(130);
        MMKeyboardUperView.a(MMKeyboardUperView.this).setVisibility(4);
        AppMethodBeat.o(125077);
      }
    };
    this.gDj = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(125078);
        MMKeyboardUperView.a(MMKeyboardUperView.this).setVisibility(0);
        AppMethodBeat.o(125078);
      }
    };
    AppMethodBeat.o(125080);
  }

  public MMKeyboardUperView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(125079);
    this.defaultHeight = -1;
    this.gDi = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(125077);
        MMKeyboardUperView.this.fullScroll(130);
        MMKeyboardUperView.a(MMKeyboardUperView.this).setVisibility(4);
        AppMethodBeat.o(125077);
      }
    };
    this.gDj = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(125078);
        MMKeyboardUperView.a(MMKeyboardUperView.this).setVisibility(0);
        AppMethodBeat.o(125078);
      }
    };
    AppMethodBeat.o(125079);
  }

  public void setupUperView(View paramView)
  {
    this.gDh = paramView;
    this.defaultHeight = -1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MMKeyboardUperView
 * JD-Core Version:    0.6.2
 */