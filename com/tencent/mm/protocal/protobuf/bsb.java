package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bsb extends bsr
{
  public LinkedList<String> EmotionList;
  public int jCt;
  public brw wUe;
  public bsl wUf;
  public String wdK;

  public bsb()
  {
    AppMethodBeat.i(65417);
    this.EmotionList = new LinkedList();
    AppMethodBeat.o(65417);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(65418);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCt);
      if (this.wUe != null)
      {
        paramArrayOfObject.iy(3, this.wUe.computeSize());
        this.wUe.writeFields(paramArrayOfObject);
      }
      if (this.wUf != null)
      {
        paramArrayOfObject.iy(4, this.wUf.computeSize());
        this.wUf.writeFields(paramArrayOfObject);
      }
      if (this.wdK != null)
        paramArrayOfObject.e(5, this.wdK);
      paramArrayOfObject.e(6, 1, this.EmotionList);
      AppMethodBeat.o(65418);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label815;
    label815: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.jCt);
      i = paramInt;
      if (this.wUe != null)
        i = paramInt + e.a.a.a.ix(3, this.wUe.computeSize());
      paramInt = i;
      if (this.wUf != null)
        paramInt = i + e.a.a.a.ix(4, this.wUf.computeSize());
      i = paramInt;
      if (this.wdK != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wdK);
      paramInt = i + e.a.a.a.c(6, 1, this.EmotionList);
      AppMethodBeat.o(65418);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.EmotionList.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(65418);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsb localbsb = (bsb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(65418);
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
            localbsb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(65418);
          paramInt = i;
          break;
        case 2:
          localbsb.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(65418);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new brw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((brw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsb.wUe = ((brw)localObject1);
          }
          AppMethodBeat.o(65418);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bsl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsb.wUf = paramArrayOfObject;
          }
          AppMethodBeat.o(65418);
          paramInt = i;
          break;
        case 5:
          localbsb.wdK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(65418);
          paramInt = i;
          break;
        case 6:
          localbsb.EmotionList.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(65418);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(65418);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsb
 * JD-Core Version:    0.6.2
 */