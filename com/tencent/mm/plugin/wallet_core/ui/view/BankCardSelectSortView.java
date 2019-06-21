package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.sortview.BaseSortView;
import com.tencent.mm.ui.base.sortview.c.a;
import com.tencent.mm.ui.base.sortview.d;

public class BankCardSelectSortView extends BaseSortView
{
  private ListView jMQ;

  public BankCardSelectSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final boolean a(String paramString, d paramd)
  {
    AppMethodBeat.i(47871);
    boolean bool = ((a)paramd.data).pcj.toUpperCase().contains(paramString.toUpperCase());
    AppMethodBeat.o(47871);
    return bool;
  }

  public c.a getItemViewCreator()
  {
    AppMethodBeat.i(47872);
    BankCardSelectSortView.1 local1 = new BankCardSelectSortView.1(this);
    AppMethodBeat.o(47872);
    return local1;
  }

  public ListView getListView()
  {
    AppMethodBeat.i(47869);
    this.jMQ = ((ListView)findViewById(2131821698));
    ListView localListView = this.jMQ;
    AppMethodBeat.o(47869);
    return localListView;
  }

  public View getNoResultView()
  {
    AppMethodBeat.i(47870);
    View localView = findViewById(2131821700);
    AppMethodBeat.o(47870);
    return localView;
  }

  public VerticalScrollBar getScrollBar()
  {
    AppMethodBeat.i(47868);
    VerticalScrollBar localVerticalScrollBar = (VerticalScrollBar)findViewById(2131821699);
    AppMethodBeat.o(47868);
    return localVerticalScrollBar;
  }

  public final View inflate()
  {
    AppMethodBeat.i(47867);
    View localView = View.inflate(getContext(), 2130968830, this);
    AppMethodBeat.o(47867);
    return localView;
  }

  public static final class a
  {
    public String cIY;
    public String pcj;
    public String puh;
    public String tNi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView
 * JD-Core Version:    0.6.2
 */