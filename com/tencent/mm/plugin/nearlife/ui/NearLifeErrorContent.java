package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class NearLifeErrorContent extends FrameLayout
{
  private View contentView;
  private ListView gKd;
  private Context mContext;
  private TextView oSL;
  private View oSM;

  public NearLifeErrorContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(22991);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(22991);
  }

  public NearLifeErrorContent(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(22990);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(22990);
  }

  private void init()
  {
    AppMethodBeat.i(22992);
    this.contentView = View.inflate(this.mContext, 2130970283, this);
    this.oSL = ((TextView)this.contentView.findViewById(2131826287));
    this.oSM = this.contentView.findViewById(2131826288);
    AppMethodBeat.o(22992);
  }

  public final void Af(int paramInt)
  {
    AppMethodBeat.i(22993);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(22993);
      while (true)
      {
        return;
        this.oSL.setVisibility(8);
        this.oSM.setVisibility(8);
        this.gKd.setVisibility(0);
        AppMethodBeat.o(22993);
        continue;
        this.oSL.setVisibility(0);
        this.oSM.setVisibility(8);
        this.gKd.setVisibility(8);
        AppMethodBeat.o(22993);
      }
      this.oSL.setVisibility(8);
      this.oSM.setVisibility(0);
      this.gKd.setVisibility(8);
    }
  }

  public void setListView(ListView paramListView)
  {
    this.gKd = paramListView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent
 * JD-Core Version:    0.6.2
 */