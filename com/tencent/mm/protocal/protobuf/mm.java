package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class mm extends com.tencent.mm.bt.a
{
  public String pdB;
  public String vQq;
  public String vQr;
  public String vQs;
  public int vQt;
  public String vQu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124299);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vQq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductId");
        AppMethodBeat.o(124299);
        throw paramArrayOfObject;
      }
      if (this.pdB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductName");
        AppMethodBeat.o(124299);
        throw paramArrayOfObject;
      }
      if (this.vQr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SellerName");
        AppMethodBeat.o(124299);
        throw paramArrayOfObject;
      }
      if (this.vQs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SellerUserName");
        AppMethodBeat.o(124299);
        throw paramArrayOfObject;
      }
      if (this.vQq != null)
        paramArrayOfObject.e(1, this.vQq);
      if (this.pdB != null)
        paramArrayOfObject.e(2, this.pdB);
      if (this.vQr != null)
        paramArrayOfObject.e(3, this.vQr);
      if (this.vQs != null)
        paramArrayOfObject.e(4, this.vQs);
      paramArrayOfObject.iz(5, this.vQt);
      if (this.vQu != null)
        paramArrayOfObject.e(6, this.vQu);
      AppMethodBeat.o(124299);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vQq == null)
        break label722;
    label722: for (i = e.a.a.b.b.a.f(1, this.vQq) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pdB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pdB);
      i = paramInt;
      if (this.vQr != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vQr);
      paramInt = i;
      if (this.vQs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vQs);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vQt);
      paramInt = i;
      if (this.vQu != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vQu);
      AppMethodBeat.o(124299);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vQq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductId");
          AppMethodBeat.o(124299);
          throw paramArrayOfObject;
        }
        if (this.pdB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductName");
          AppMethodBeat.o(124299);
          throw paramArrayOfObject;
        }
        if (this.vQr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SellerName");
          AppMethodBeat.o(124299);
          throw paramArrayOfObject;
        }
        if (this.vQs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SellerUserName");
          AppMethodBeat.o(124299);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124299);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mm localmm = (mm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124299);
          break;
        case 1:
          localmm.vQq = locala.BTU.readString();
          AppMethodBeat.o(124299);
          paramInt = i;
          break;
        case 2:
          localmm.pdB = locala.BTU.readString();
          AppMethodBeat.o(124299);
          paramInt = i;
          break;
        case 3:
          localmm.vQr = locala.BTU.readString();
          AppMethodBeat.o(124299);
          paramInt = i;
          break;
        case 4:
          localmm.vQs = locala.BTU.readString();
          AppMethodBeat.o(124299);
          paramInt = i;
          break;
        case 5:
          localmm.vQt = locala.BTU.vd();
          AppMethodBeat.o(124299);
          paramInt = i;
          break;
        case 6:
          localmm.vQu = locala.BTU.readString();
          AppMethodBeat.o(124299);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124299);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mm
 * JD-Core Version:    0.6.2
 */