package com.tencent.mm.chatroom.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.m;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.a.b;
import com.tencent.mm.chatroom.a.b.a;
import java.util.Collection;

public class DayPickerView extends RecyclerView
{
  private TypedArray egT;
  private com.tencent.mm.chatroom.a.a egU;
  protected b eiX;
  protected int eiY;
  protected long eiZ;
  private RecyclerView.m eja;
  private Collection<com.tencent.mm.chatroom.c.a> ejb;
  private long ejc;
  protected Context mContext;
  protected int sU;

  public DayPickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DayPickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(104080);
    this.eiY = 0;
    this.sU = 0;
    this.ejc = -1L;
    if (!isInEditMode())
    {
      this.egT = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.DayPickerView);
      setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
      setLayoutManager(new LinearLayoutManager());
      this.mContext = paramContext;
      setVerticalScrollBarEnabled(false);
      setOnScrollListener(this.eja);
      setFadingEdgeLength(0);
      this.eja = new RecyclerView.m()
      {
        public final void a(RecyclerView paramAnonymousRecyclerView, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          AppMethodBeat.i(104079);
          super.a(paramAnonymousRecyclerView, paramAnonymousInt1, paramAnonymousInt2);
          if ((c)paramAnonymousRecyclerView.getChildAt(0) == null)
            AppMethodBeat.o(104079);
          while (true)
          {
            return;
            DayPickerView.this.eiZ = paramAnonymousInt2;
            DayPickerView.this.sU = DayPickerView.this.eiY;
            AppMethodBeat.o(104079);
          }
        }
      };
    }
    AppMethodBeat.o(104080);
  }

  public final void a(com.tencent.mm.chatroom.a.a parama, Collection<com.tencent.mm.chatroom.c.a> paramCollection)
  {
    AppMethodBeat.i(104081);
    this.ejb = paramCollection;
    this.egU = parama;
    setUpAdapter(paramCollection);
    setAdapter(this.eiX);
    bY(this.eiX.getItemCount() - 1);
    this.eiX.aop.notifyChanged();
    AppMethodBeat.o(104081);
  }

  protected com.tencent.mm.chatroom.a.a getController()
  {
    return this.egU;
  }

  public b.a<com.tencent.mm.chatroom.c.a> getSelectedDays()
  {
    return this.eiX.egV;
  }

  protected TypedArray getTypedArray()
  {
    return this.egT;
  }

  public void setBeginDate(long paramLong)
  {
    this.ejc = paramLong;
  }

  protected void setUpAdapter(Collection<com.tencent.mm.chatroom.c.a> paramCollection)
  {
    AppMethodBeat.i(104082);
    if (this.eiX == null)
      this.eiX = new b(getContext(), this.egU, this.egT, this.ejc, paramCollection);
    AppMethodBeat.o(104082);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.DayPickerView
 * JD-Core Version:    0.6.2
 */