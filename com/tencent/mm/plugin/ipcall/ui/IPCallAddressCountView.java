package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class IPCallAddressCountView extends FrameLayout
{
  private View gbS;
  private TextView nBf;

  private IPCallAddressCountView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(22045);
    init();
    AppMethodBeat.o(22045);
  }

  public IPCallAddressCountView(Context paramContext, int paramInt)
  {
    this(paramContext);
    AppMethodBeat.i(22046);
    setAddressCount(paramInt);
    AppMethodBeat.o(22046);
  }

  public IPCallAddressCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22044);
    init();
    AppMethodBeat.o(22044);
  }

  private void init()
  {
    AppMethodBeat.i(22047);
    inflate(getContext(), 2130969880, this);
    this.gbS = findViewById(2131822964);
    this.nBf = ((TextView)findViewById(2131822965));
    AppMethodBeat.o(22047);
  }

  public void setAddressCount(int paramInt)
  {
    AppMethodBeat.i(22048);
    this.nBf.setText(getContext().getResources().getQuantityString(2131361793, paramInt, new Object[] { Integer.valueOf(paramInt) }));
    AppMethodBeat.o(22048);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAddressCountView
 * JD-Core Version:    0.6.2
 */