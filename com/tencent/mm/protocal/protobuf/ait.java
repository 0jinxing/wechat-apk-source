package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ait extends bsr
{
  public String kKO;
  public String person_id;
  public int scene;
  public String vYl;
  public String woJ;
  public int woM;
  public String woN;
  public String woO;
  public biv woh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(849);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.person_id != null)
        paramArrayOfObject.e(2, this.person_id);
      if (this.woJ != null)
        paramArrayOfObject.e(3, this.woJ);
      paramArrayOfObject.iz(4, this.woM);
      if (this.woN != null)
        paramArrayOfObject.e(5, this.woN);
      if (this.woO != null)
        paramArrayOfObject.e(6, this.woO);
      paramArrayOfObject.iz(7, this.scene);
      if (this.vYl != null)
        paramArrayOfObject.e(8, this.vYl);
      if (this.kKO != null)
        paramArrayOfObject.e(9, this.kKO);
      if (this.woh != null)
      {
        paramArrayOfObject.iy(10, this.woh.computeSize());
        this.woh.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(849);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label979;
    label979: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.person_id != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.person_id);
      i = paramInt;
      if (this.woJ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.woJ);
      i += e.a.a.b.b.a.bs(4, this.woM);
      paramInt = i;
      if (this.woN != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.woN);
      i = paramInt;
      if (this.woO != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.woO);
      i += e.a.a.b.b.a.bs(7, this.scene);
      paramInt = i;
      if (this.vYl != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vYl);
      i = paramInt;
      if (this.kKO != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.kKO);
      paramInt = i;
      if (this.woh != null)
        paramInt = i + e.a.a.a.ix(10, this.woh.computeSize());
      AppMethodBeat.o(849);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(849);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ait localait = (ait)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(849);
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
            localait.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 2:
          localait.person_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 3:
          localait.woJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 4:
          localait.woM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 5:
          localait.woN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 6:
          localait.woO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 7:
          localait.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 8:
          localait.vYl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 9:
          localait.kKO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new biv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((biv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localait.woh = ((biv)localObject1);
          }
          AppMethodBeat.o(849);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(849);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ait
 * JD-Core Version:    0.6.2
 */