package com.tencent.mm.chatroom.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Calendar;

public final class a
{
  private Calendar calendar;
  public long cvx;
  public int ehf;
  public long ehg;
  public int month;
  public int year;

  public a()
  {
    AppMethodBeat.i(103902);
    setTime(System.currentTimeMillis());
    AppMethodBeat.o(103902);
  }

  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(103903);
    this.year = paramInt1;
    this.month = paramInt2;
    this.ehf = paramInt3;
    AppMethodBeat.o(103903);
  }

  public a(long paramLong)
  {
    AppMethodBeat.i(103904);
    this.ehg = paramLong;
    setTime(paramLong);
    AppMethodBeat.o(103904);
  }

  private void setTime(long paramLong)
  {
    AppMethodBeat.i(103905);
    this.ehg = paramLong;
    if (this.calendar == null)
      this.calendar = Calendar.getInstance();
    this.calendar.setTimeInMillis(paramLong);
    this.month = this.calendar.get(2);
    this.year = this.calendar.get(1);
    this.ehf = this.calendar.get(5);
    AppMethodBeat.o(103905);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      bool2 = bool1;
      if (paramObject.ehf == this.ehf)
      {
        bool2 = bool1;
        if (paramObject.month == this.month)
        {
          bool2 = bool1;
          if (paramObject.year == this.year)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  public final String toString()
  {
    AppMethodBeat.i(103906);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{ year: ");
    ((StringBuilder)localObject).append(this.year);
    ((StringBuilder)localObject).append(", month: ");
    ((StringBuilder)localObject).append(this.month);
    ((StringBuilder)localObject).append(", day: ");
    ((StringBuilder)localObject).append(this.ehf);
    ((StringBuilder)localObject).append(" }");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(103906);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.c.a
 * JD-Core Version:    0.6.2
 */