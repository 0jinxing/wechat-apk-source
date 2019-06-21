package com.tencent.mm.plugin.location.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMImageButton;

public class ShareHeader extends LinearLayout
{
  private TextView gne;
  private Context mContext;
  private ViewGroup nMu;
  private MMImageButton nMv;
  private MMImageButton nMw;

  public ShareHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(113486);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(113486);
  }

  @TargetApi(11)
  public ShareHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(113485);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(113485);
  }

  private void init()
  {
    AppMethodBeat.i(113487);
    View localView = View.inflate(this.mContext, 2130970663, this);
    this.nMu = ((ViewGroup)localView.findViewById(2131825945));
    this.nMv = ((MMImageButton)localView.findViewById(2131827535));
    this.nMw = ((MMImageButton)localView.findViewById(2131827537));
    this.gne = ((TextView)localView.findViewById(2131820678));
    AppMethodBeat.o(113487);
  }

  public ViewGroup getHeaderBar()
  {
    return this.nMu;
  }

  public void setOnLeftClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(113488);
    this.nMv.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(113488);
  }

  public void setOnRightClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(113489);
    this.nMw.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(113489);
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(113490);
    this.gne.setText(paramString);
    AppMethodBeat.o(113490);
  }

  public void setTitleColor(int paramInt)
  {
    AppMethodBeat.i(113491);
    this.gne.setTextColor(paramInt);
    AppMethodBeat.o(113491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.ShareHeader
 * JD-Core Version:    0.6.2
 */