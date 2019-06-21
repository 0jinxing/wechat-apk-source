package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class h extends bsr
{
  public int scene;
  public String title;
  public String vzM;
  public LinkedList<j> vzQ;
  public aw vzR;
  public long vzS;
  public long vzU;

  public h()
  {
    AppMethodBeat.i(56675);
    this.vzQ = new LinkedList();
    AppMethodBeat.o(56675);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56676);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      paramArrayOfObject.ai(3, this.vzU);
      paramArrayOfObject.e(5, 8, this.vzQ);
      paramArrayOfObject.iz(7, this.scene);
      if (this.vzM != null)
        paramArrayOfObject.e(8, this.vzM);
      if (this.vzR != null)
      {
        paramArrayOfObject.iy(9, this.vzR.computeSize());
        this.vzR.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(10, this.vzS);
      AppMethodBeat.o(56676);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label905;
    label905: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.title);
      i = i + e.a.a.b.b.a.o(3, this.vzU) + e.a.a.a.c(5, 8, this.vzQ) + e.a.a.b.b.a.bs(7, this.scene);
      paramInt = i;
      if (this.vzM != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vzM);
      i = paramInt;
      if (this.vzR != null)
        i = paramInt + e.a.a.a.ix(9, this.vzR.computeSize());
      paramInt = i + e.a.a.b.b.a.o(10, this.vzS);
      AppMethodBeat.o(56676);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzQ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56676);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 4:
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(56676);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 2:
          localh.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 3:
          localh.vzU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new j();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.vzQ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 7:
          localh.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 8:
          localh.vzM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.vzR = ((aw)localObject1);
          }
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        case 10:
          localh.vzS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56676);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56676);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.h
 * JD-Core Version:    0.6.2
 */