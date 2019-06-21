package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class kl extends com.tencent.mm.bt.a
{
  public String content;
  public String kKw;
  public String kbV;
  public int vGr;
  public String vGs;
  public int vMO;
  public int vMP;
  public int vNl;
  public int vNm;
  public int vNn;
  public tq vNo;
  public int vNp;
  public int vNq;
  public int vNr = 0;
  public int vNs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14712);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vNl);
      paramArrayOfObject.iz(2, this.vGr);
      if (this.vGs != null)
        paramArrayOfObject.e(3, this.vGs);
      if (this.kKw != null)
        paramArrayOfObject.e(4, this.kKw);
      if (this.kbV != null)
        paramArrayOfObject.e(5, this.kbV);
      if (this.content != null)
        paramArrayOfObject.e(6, this.content);
      paramArrayOfObject.iz(7, this.vNm);
      paramArrayOfObject.iz(8, this.vNn);
      paramArrayOfObject.iz(9, this.vMO);
      paramArrayOfObject.iz(10, this.vMP);
      if (this.vNo != null)
      {
        paramArrayOfObject.iy(11, this.vNo.computeSize());
        this.vNo.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(12, this.vNp);
      paramArrayOfObject.iz(13, this.vNq);
      paramArrayOfObject.iz(14, this.vNr);
      paramArrayOfObject.iz(15, this.vNs);
      AppMethodBeat.o(14712);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vNl) + 0 + e.a.a.b.b.a.bs(2, this.vGr);
        i = paramInt;
        if (this.vGs != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vGs);
        paramInt = i;
        if (this.kKw != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.kKw);
        i = paramInt;
        if (this.kbV != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.kbV);
        paramInt = i;
        if (this.content != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.content);
        i = paramInt + e.a.a.b.b.a.bs(7, this.vNm) + e.a.a.b.b.a.bs(8, this.vNn) + e.a.a.b.b.a.bs(9, this.vMO) + e.a.a.b.b.a.bs(10, this.vMP);
        paramInt = i;
        if (this.vNo != null)
          paramInt = i + e.a.a.a.ix(11, this.vNo.computeSize());
        paramInt = paramInt + e.a.a.b.b.a.bs(12, this.vNp) + e.a.a.b.b.a.bs(13, this.vNq) + e.a.a.b.b.a.bs(14, this.vNr) + e.a.a.b.b.a.bs(15, this.vNs);
        AppMethodBeat.o(14712);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14712);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        kl localkl = (kl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14712);
          break;
        case 1:
          localkl.vNl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 2:
          localkl.vGr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 3:
          localkl.vGs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 4:
          localkl.kKw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 5:
          localkl.kbV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 6:
          localkl.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 7:
          localkl.vNm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 8:
          localkl.vNn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 9:
          localkl.vMO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 10:
          localkl.vMP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new tq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localkl.vNo = paramArrayOfObject;
          }
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 12:
          localkl.vNp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 13:
          localkl.vNq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 14:
          localkl.vNr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        case 15:
          localkl.vNs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14712);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(14712);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kl
 * JD-Core Version:    0.6.2
 */