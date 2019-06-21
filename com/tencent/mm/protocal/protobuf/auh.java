package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class auh extends com.tencent.mm.bt.a
{
  public String pdz;
  public String pho;
  public String wma;
  public String wym;
  public String wyn;
  public String wyo;
  public String wyp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48873);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pho == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: product_id");
        AppMethodBeat.o(48873);
        throw paramArrayOfObject;
      }
      if (this.pdz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: price");
        AppMethodBeat.o(48873);
        throw paramArrayOfObject;
      }
      if (this.wma == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: currency_type");
        AppMethodBeat.o(48873);
        throw paramArrayOfObject;
      }
      if (this.wym == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: session_data");
        AppMethodBeat.o(48873);
        throw paramArrayOfObject;
      }
      if (this.pho != null)
        paramArrayOfObject.e(1, this.pho);
      if (this.pdz != null)
        paramArrayOfObject.e(2, this.pdz);
      if (this.wma != null)
        paramArrayOfObject.e(3, this.wma);
      if (this.wym != null)
        paramArrayOfObject.e(4, this.wym);
      if (this.wyn != null)
        paramArrayOfObject.e(5, this.wyn);
      if (this.wyo != null)
        paramArrayOfObject.e(6, this.wyo);
      if (this.wyp != null)
        paramArrayOfObject.e(7, this.wyp);
      AppMethodBeat.o(48873);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pho == null)
        break label805;
    label805: for (i = e.a.a.b.b.a.f(1, this.pho) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pdz != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pdz);
      i = paramInt;
      if (this.wma != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wma);
      paramInt = i;
      if (this.wym != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wym);
      i = paramInt;
      if (this.wyn != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wyn);
      paramInt = i;
      if (this.wyo != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wyo);
      i = paramInt;
      if (this.wyp != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wyp);
      AppMethodBeat.o(48873);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.pho == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: product_id");
          AppMethodBeat.o(48873);
          throw paramArrayOfObject;
        }
        if (this.pdz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: price");
          AppMethodBeat.o(48873);
          throw paramArrayOfObject;
        }
        if (this.wma == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: currency_type");
          AppMethodBeat.o(48873);
          throw paramArrayOfObject;
        }
        if (this.wym == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: session_data");
          AppMethodBeat.o(48873);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48873);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        auh localauh = (auh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48873);
          break;
        case 1:
          localauh.pho = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        case 2:
          localauh.pdz = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        case 3:
          localauh.wma = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        case 4:
          localauh.wym = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        case 5:
          localauh.wyn = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        case 6:
          localauh.wyo = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        case 7:
          localauh.wyp = locala.BTU.readString();
          AppMethodBeat.o(48873);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48873);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.auh
 * JD-Core Version:    0.6.2
 */