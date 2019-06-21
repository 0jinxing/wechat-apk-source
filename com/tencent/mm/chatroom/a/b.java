package com.tencent.mm.chatroom.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.ui.c.a;
import java.util.Calendar;
import java.util.Collection;

public final class b extends RecyclerView.a<b.b>
  implements c.a
{
  private final Calendar calendar;
  private final TypedArray egT;
  private final a egU;
  public final b.a<com.tencent.mm.chatroom.c.a> egV;
  private final Collection<com.tencent.mm.chatroom.c.a> egW;
  private final Integer egX;
  private final Integer egY;
  private final boolean egZ;
  private final Context mContext;

  public b(Context paramContext, a parama, TypedArray paramTypedArray, long paramLong, Collection<com.tencent.mm.chatroom.c.a> paramCollection)
  {
    AppMethodBeat.i(103892);
    this.egT = paramTypedArray;
    this.calendar = Calendar.getInstance();
    this.egY = Integer.valueOf(paramTypedArray.getInt(20, this.calendar.get(2) % 12));
    if (-1L != paramLong)
      this.calendar.setTimeInMillis(paramLong);
    this.egX = Integer.valueOf(paramTypedArray.getInt(19, this.calendar.get(2)));
    this.egZ = paramTypedArray.getBoolean(18, false);
    this.egV = new b.a();
    this.egW = paramCollection;
    this.mContext = paramContext;
    this.egU = parama;
    if (this.egT.getBoolean(16, false))
      c(new com.tencent.mm.chatroom.c.a(System.currentTimeMillis()));
    AppMethodBeat.o(103892);
  }

  private void c(com.tencent.mm.chatroom.c.a parama)
  {
    AppMethodBeat.i(103895);
    this.egU.a(parama);
    d(parama);
    AppMethodBeat.o(103895);
  }

  private void d(com.tencent.mm.chatroom.c.a parama)
  {
    AppMethodBeat.i(103896);
    if (this.egZ)
    {
      int i;
      if ((this.egV.first != null) && (this.egV.eha == null))
      {
        this.egV.eha = parama;
        if (((com.tencent.mm.chatroom.c.a)this.egV.first).month < parama.month)
          i = 0;
      }
      else
      {
        while (i < ((com.tencent.mm.chatroom.c.a)this.egV.first).month - parama.month - 1)
        {
          this.egU.a(parama);
          i++;
          continue;
          if (this.egV.eha == null)
            break label141;
          this.egV.first = parama;
          this.egV.eha = null;
        }
      }
    }
    while (true)
    {
      this.aop.notifyChanged();
      AppMethodBeat.o(103896);
      return;
      label141: this.egV.first = parama;
      continue;
      this.egV.first = parama;
    }
  }

  public final void b(com.tencent.mm.chatroom.c.a parama)
  {
    AppMethodBeat.i(103894);
    if (parama != null)
      c(parama);
    AppMethodBeat.o(103894);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(103893);
    int i = (new com.tencent.mm.chatroom.c.a(this.egU.Jz()).year - this.calendar.get(1) + 1) * 12;
    int j = i;
    if (this.egX.intValue() != -1)
      j = i - this.egX.intValue();
    i = j;
    if (this.egY.intValue() != -1)
      i = j - (12 - this.egY.intValue() - 1);
    AppMethodBeat.o(103893);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.a.b
 * JD-Core Version:    0.6.2
 */