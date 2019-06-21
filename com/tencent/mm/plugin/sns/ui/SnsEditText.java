package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.MMEditText;

public class SnsEditText extends MMEditText
{
  private Context context;
  private int iHm;
  private boolean nJS;
  private ClipboardManager rrN;
  private int rrO;
  private int rrP;
  private int rrQ;
  private float y;

  public SnsEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38932);
    this.rrN = null;
    this.iHm = 0;
    this.rrO = 0;
    this.rrP = 0;
    this.nJS = false;
    this.rrQ = 10;
    this.context = paramContext;
    this.rrN = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    addTextChangedListener(new SnsEditText.1(this));
    AppMethodBeat.o(38932);
  }

  public int getPasterLen()
  {
    return this.iHm;
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    AppMethodBeat.i(38933);
    boolean bool = super.onTextContextMenuItem(paramInt);
    AppMethodBeat.o(38933);
    return bool;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(38934);
    if (paramMotionEvent.getAction() == 2)
      if (Math.abs(this.y - paramMotionEvent.getY()) > this.rrQ)
        this.nJS = true;
    while (true)
    {
      this.y = paramMotionEvent.getY();
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(38934);
      while (true)
      {
        return bool;
        if (paramMotionEvent.getAction() != 1)
          break label90;
        if (!this.nJS)
          break;
        this.nJS = false;
        AppMethodBeat.o(38934);
      }
      label90: this.nJS = false;
    }
  }

  public void setPasterLen(int paramInt)
  {
    this.iHm = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsEditText
 * JD-Core Version:    0.6.2
 */