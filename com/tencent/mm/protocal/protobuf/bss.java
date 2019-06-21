package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bss extends bsr
{
  public int pLQ;
  public String pMd;
  public String pMe;
  public String pbn;
  public String vHu;
  public int vPy;
  public String wKQ;
  public int wUL;
  public String wUM;
  public int wUN;
  public int wUO;
  public b wUP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48955);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.pMd != null)
        paramArrayOfObject.e(2, this.pMd);
      if (this.pMe != null)
        paramArrayOfObject.e(3, this.pMe);
      if (this.pbn != null)
        paramArrayOfObject.e(4, this.pbn);
      paramArrayOfObject.iz(5, this.pLQ);
      paramArrayOfObject.iz(6, this.wUL);
      if (this.wUM != null)
        paramArrayOfObject.e(7, this.wUM);
      paramArrayOfObject.iz(8, this.wUN);
      paramArrayOfObject.iz(9, this.wUO);
      if (this.vHu != null)
        paramArrayOfObject.e(10, this.vHu);
      if (this.wKQ != null)
        paramArrayOfObject.e(11, this.wKQ);
      if (this.wUP != null)
        paramArrayOfObject.c(12, this.wUP);
      paramArrayOfObject.iz(13, this.vPy);
      AppMethodBeat.o(48955);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1012;
    label1012: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pMd != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pMd);
      i = paramInt;
      if (this.pMe != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pMe);
      paramInt = i;
      if (this.pbn != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pbn);
      i = paramInt + e.a.a.b.b.a.bs(5, this.pLQ) + e.a.a.b.b.a.bs(6, this.wUL);
      paramInt = i;
      if (this.wUM != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wUM);
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.wUN) + e.a.a.b.b.a.bs(9, this.wUO);
      i = paramInt;
      if (this.vHu != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vHu);
      paramInt = i;
      if (this.wKQ != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wKQ);
      i = paramInt;
      if (this.wUP != null)
        i = paramInt + e.a.a.b.b.a.b(12, this.wUP);
      paramInt = i + e.a.a.b.b.a.bs(13, this.vPy);
      AppMethodBeat.o(48955);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48955);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bss localbss = (bss)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48955);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbss.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 2:
          localbss.pMd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 3:
          localbss.pMe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 4:
          localbss.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 5:
          localbss.pLQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 6:
          localbss.wUL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 7:
          localbss.wUM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 8:
          localbss.wUN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 9:
          localbss.wUO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 10:
          localbss.vHu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 11:
          localbss.wKQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 12:
          localbss.wUP = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        case 13:
          localbss.vPy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48955);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48955);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bss
 * JD-Core Version:    0.6.2
 */