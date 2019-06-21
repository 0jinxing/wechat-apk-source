package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bsf extends bsr
{
  public long bHi;
  public LinkedList<zd> wUh;
  public int wUi;
  public int wUj;
  public LinkedList<sp> wUk;
  public int wUl;
  public sq wsi;

  public bsf()
  {
    AppMethodBeat.i(134443);
    this.wUh = new LinkedList();
    this.wUk = new LinkedList();
    AppMethodBeat.o(134443);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134444);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.bHi);
      paramArrayOfObject.e(3, 8, this.wUh);
      paramArrayOfObject.iz(5, this.wUi);
      paramArrayOfObject.iz(6, this.wUj);
      if (this.wsi != null)
      {
        paramArrayOfObject.iy(7, this.wsi.computeSize());
        this.wsi.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(8, 8, this.wUk);
      paramArrayOfObject.iz(9, this.wUl);
      AppMethodBeat.o(134444);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label963;
    label963: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.bHi) + e.a.a.a.c(3, 8, this.wUh) + e.a.a.b.b.a.bs(5, this.wUi) + e.a.a.b.b.a.bs(6, this.wUj);
      paramInt = i;
      if (this.wsi != null)
        paramInt = i + e.a.a.a.ix(7, this.wsi.computeSize());
      paramInt = paramInt + e.a.a.a.c(8, 8, this.wUk) + e.a.a.b.b.a.bs(9, this.wUl);
      AppMethodBeat.o(134444);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wUh.clear();
        this.wUk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134444);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsf localbsf = (bsf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 4:
        default:
          paramInt = -1;
          AppMethodBeat.o(134444);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsf.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 2:
          localbsf.bHi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new zd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsf.wUh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 5:
          localbsf.wUi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 6:
          localbsf.wUj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new sq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsf.wsi = ((sq)localObject1);
          }
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new sp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((sp)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsf.wUk.add(localObject1);
          }
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        case 9:
          localbsf.wUl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(134444);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134444);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsf
 * JD-Core Version:    0.6.2
 */