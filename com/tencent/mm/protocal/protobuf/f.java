package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class f extends bsr
{
  public int scene;
  public String title;
  public String vzM;
  public int vzO;
  public long vzP;
  public LinkedList<String> vzQ;
  public aw vzR;
  public long vzS;

  public f()
  {
    AppMethodBeat.i(56672);
    this.vzQ = new LinkedList();
    AppMethodBeat.o(56672);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56673);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vzO);
      paramArrayOfObject.ai(3, this.vzP);
      if (this.title != null)
        paramArrayOfObject.e(4, this.title);
      paramArrayOfObject.e(5, 1, this.vzQ);
      paramArrayOfObject.iz(6, this.scene);
      if (this.vzM != null)
        paramArrayOfObject.e(7, this.vzM);
      if (this.vzR != null)
      {
        paramArrayOfObject.iy(8, this.vzR.computeSize());
        this.vzR.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(9, this.vzS);
      AppMethodBeat.o(56673);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label863;
    label863: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vzO) + e.a.a.b.b.a.o(3, this.vzP);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.title);
      i = paramInt + e.a.a.a.c(5, 1, this.vzQ) + e.a.a.b.b.a.bs(6, this.scene);
      paramInt = i;
      if (this.vzM != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vzM);
      i = paramInt;
      if (this.vzR != null)
        i = paramInt + e.a.a.a.ix(8, this.vzR.computeSize());
      paramInt = i + e.a.a.b.b.a.o(9, this.vzS);
      AppMethodBeat.o(56673);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzQ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56673);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        f localf = (f)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56673);
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
            localf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 2:
          localf.vzO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 3:
          localf.vzP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 4:
          localf.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 5:
          localf.vzQ.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 6:
          localf.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 7:
          localf.vzM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localf.vzR = paramArrayOfObject;
          }
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        case 9:
          localf.vzS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56673);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56673);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.f
 * JD-Core Version:    0.6.2
 */