package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.g;

public class TestTimeForSns extends FrameLayout
{
  public final boolean DEBUG = true;
  public final String TAG = "MicroMsg.TestTimeForSns";
  public long beginTime;
  private boolean hasDrawed;
  private TestTimeForSns.a listener;

  public TestTimeForSns(Context paramContext)
  {
    super(paramContext);
  }

  public TestTimeForSns(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(39842);
    super.dispatchDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.listener != null)
        this.listener.bCv();
    }
    g.BO(10);
    g.BO(22);
    AppMethodBeat.o(39842);
  }

  public boolean hasDrawed()
  {
    return this.hasDrawed;
  }

  public void setListener(TestTimeForSns.a parama)
  {
    this.listener = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TestTimeForSns
 * JD-Core Version:    0.6.2
 */