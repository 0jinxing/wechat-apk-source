package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.DrawnCallBackLinearLayout;

public class TestTimeForChatting extends DrawnCallBackLinearLayout
{
  public final String TAG = "MicroMsg.TestTimeForChatting";
  private int eNs = 0;
  private long fYr;
  TestTimeForChatting.a zHX;
  public int zHY = 0;
  public int zHZ = 0;

  public TestTimeForChatting(Context paramContext)
  {
    super(paramContext);
  }

  public TestTimeForChatting(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void dJY()
  {
    AppMethodBeat.i(35004);
    ab.i("MicroMsg.TestTimeForChatting", "start chatting response time: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.fYr) });
    this.eNs = 0;
    AppMethodBeat.o(35004);
  }

  public final void dJZ()
  {
    AppMethodBeat.i(35005);
    ab.i("MicroMsg.TestTimeForChatting", "klem frameCount:%d", new Object[] { Integer.valueOf(this.eNs) });
    h.pYm.e(11198, new Object[] { Integer.valueOf(this.eNs) });
    AppMethodBeat.o(35005);
  }

  public void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(35006);
    this.eNs += 1;
    try
    {
      super.dispatchDraw(paramCanvas);
      g.BO(9);
      g.BO(18);
      g.BO(25);
      g.BO(24);
      g.BO(20);
      g.BO(18);
      if (this.zHX != null)
        post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(35002);
            if (TestTimeForChatting.this.zHX != null)
              TestTimeForChatting.this.zHX.dyY();
            AppMethodBeat.o(35002);
          }
        });
      AppMethodBeat.o(35006);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TestTimeForChatting", paramCanvas, "dispatchDraw", new Object[0]);
    }
  }

  public boolean fitSystemWindows(Rect paramRect)
  {
    AppMethodBeat.i(35007);
    ab.d("MicroMsg.TestTimeForChatting", "ashu::fitSystemWindows: %s, fixBottomPadding:%d fixRightPadding:%d", new Object[] { paramRect.toString(), Integer.valueOf(this.zHY), Integer.valueOf(this.zHZ) });
    paramRect.bottom += this.zHY;
    paramRect.right += this.zHZ;
    boolean bool = super.fitSystemWindows(paramRect);
    AppMethodBeat.o(35007);
    return bool;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(35003);
    long l = System.currentTimeMillis();
    super.onDraw(paramCanvas);
    ab.i("MicroMsg.TestTimeForChatting", System.currentTimeMillis() - l);
    AppMethodBeat.o(35003);
  }

  public void setOndispatchDraw(TestTimeForChatting.a parama)
  {
    this.zHX = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.TestTimeForChatting
 * JD-Core Version:    0.6.2
 */