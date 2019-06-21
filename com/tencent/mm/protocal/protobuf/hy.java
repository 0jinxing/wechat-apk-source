package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class hy extends bsr
{
  public LinkedList<String> vKr;
  public LinkedList<bsq> vKs;
  public String vKt;
  public long vKu;
  public int vKv;
  public int vKw;

  public hy()
  {
    AppMethodBeat.i(14707);
    this.vKr = new LinkedList();
    this.vKs = new LinkedList();
    AppMethodBeat.o(14707);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14708);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.vKr);
      paramArrayOfObject.e(3, 8, this.vKs);
      if (this.vKt != null)
        paramArrayOfObject.e(4, this.vKt);
      paramArrayOfObject.ai(5, this.vKu);
      paramArrayOfObject.iz(6, this.vKv);
      paramArrayOfObject.iz(7, this.vKw);
      AppMethodBeat.o(14708);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label744;
    label744: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 1, this.vKr) + e.a.a.a.c(3, 8, this.vKs);
      paramInt = i;
      if (this.vKt != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vKt);
      paramInt = paramInt + e.a.a.b.b.a.o(5, this.vKu) + e.a.a.b.b.a.bs(6, this.vKv) + e.a.a.b.b.a.bs(7, this.vKw);
      AppMethodBeat.o(14708);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vKr.clear();
        this.vKs.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14708);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        hy localhy = (hy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14708);
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
            localhy.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        case 2:
          localhy.vKr.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bsq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bsq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhy.vKs.add(localObject1);
          }
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        case 4:
          localhy.vKt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        case 5:
          localhy.vKu = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        case 6:
          localhy.vKv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        case 7:
          localhy.vKw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14708);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14708);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hy
 * JD-Core Version:    0.6.2
 */