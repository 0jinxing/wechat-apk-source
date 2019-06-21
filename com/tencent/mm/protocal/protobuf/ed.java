package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ed extends bsr
{
  public int kdC;
  public int offset;
  public int scene;
  public String session_id;
  public String url;
  public int vFO;
  public int vFP;
  public int vFQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14686);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      paramArrayOfObject.iz(4, this.offset);
      paramArrayOfObject.iz(6, this.kdC);
      paramArrayOfObject.iz(7, this.scene);
      paramArrayOfObject.iz(8, this.vFQ);
      paramArrayOfObject.iz(9, this.vFP);
      paramArrayOfObject.iz(10, this.vFO);
      if (this.session_id != null)
        paramArrayOfObject.e(11, this.session_id);
      AppMethodBeat.o(14686);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label758;
    label758: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.url);
      i = i + e.a.a.b.b.a.bs(4, this.offset) + e.a.a.b.b.a.bs(6, this.kdC) + e.a.a.b.b.a.bs(7, this.scene) + e.a.a.b.b.a.bs(8, this.vFQ) + e.a.a.b.b.a.bs(9, this.vFP) + e.a.a.b.b.a.bs(10, this.vFO);
      paramInt = i;
      if (this.session_id != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.session_id);
      AppMethodBeat.o(14686);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14686);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ed localed = (ed)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 3:
        case 5:
        default:
          AppMethodBeat.o(14686);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localed.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 2:
          localed.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 4:
          localed.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 6:
          localed.kdC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 7:
          localed.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 8:
          localed.vFQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 9:
          localed.vFP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 10:
          localed.vFO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        case 11:
          localed.session_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14686);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14686);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ed
 * JD-Core Version:    0.6.2
 */