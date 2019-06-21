package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class yi extends com.tencent.mm.bt.a
{
  public int vEq;
  public String wea;
  public String web;
  public String wec;
  public String wed;
  public String wee;
  public int wef;
  public int weg;
  public String weh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62544);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wea == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BegWord");
        AppMethodBeat.o(62544);
        throw paramArrayOfObject;
      }
      if (this.web == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BegPicUrl");
        AppMethodBeat.o(62544);
        throw paramArrayOfObject;
      }
      if (this.wec == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThanksPicUrl");
        AppMethodBeat.o(62544);
        throw paramArrayOfObject;
      }
      if (this.wea != null)
        paramArrayOfObject.e(1, this.wea);
      if (this.web != null)
        paramArrayOfObject.e(2, this.web);
      if (this.wec != null)
        paramArrayOfObject.e(3, this.wec);
      if (this.wed != null)
        paramArrayOfObject.e(4, this.wed);
      if (this.wee != null)
        paramArrayOfObject.e(5, this.wee);
      paramArrayOfObject.iz(6, this.wef);
      paramArrayOfObject.iz(7, this.weg);
      if (this.weh != null)
        paramArrayOfObject.e(8, this.weh);
      paramArrayOfObject.iz(9, this.vEq);
      AppMethodBeat.o(62544);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wea == null)
        break label835;
    label835: for (paramInt = e.a.a.b.b.a.f(1, this.wea) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.web != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.web);
      paramInt = i;
      if (this.wec != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wec);
      i = paramInt;
      if (this.wed != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wed);
      paramInt = i;
      if (this.wee != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wee);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wef) + e.a.a.b.b.a.bs(7, this.weg);
      paramInt = i;
      if (this.weh != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.weh);
      paramInt += e.a.a.b.b.a.bs(9, this.vEq);
      AppMethodBeat.o(62544);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wea == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BegWord");
          AppMethodBeat.o(62544);
          throw paramArrayOfObject;
        }
        if (this.web == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BegPicUrl");
          AppMethodBeat.o(62544);
          throw paramArrayOfObject;
        }
        if (this.wec == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThanksPicUrl");
          AppMethodBeat.o(62544);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62544);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        yi localyi = (yi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62544);
          break;
        case 1:
          localyi.wea = locala.BTU.readString();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 2:
          localyi.web = locala.BTU.readString();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 3:
          localyi.wec = locala.BTU.readString();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 4:
          localyi.wed = locala.BTU.readString();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 5:
          localyi.wee = locala.BTU.readString();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 6:
          localyi.wef = locala.BTU.vd();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 7:
          localyi.weg = locala.BTU.vd();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 8:
          localyi.weh = locala.BTU.readString();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        case 9:
          localyi.vEq = locala.BTU.vd();
          AppMethodBeat.o(62544);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62544);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yi
 * JD-Core Version:    0.6.2
 */