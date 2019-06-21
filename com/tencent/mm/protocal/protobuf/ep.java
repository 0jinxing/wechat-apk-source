package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ep extends bsr
{
  public String content;
  public int kdC;
  public int scene;
  public String session_id;
  public String title;
  public String url;
  public int vFO;
  public int vFP;
  public int vFQ;
  public int vGr;
  public long vGx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14700);
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
      if (this.content != null)
        paramArrayOfObject.e(4, this.content);
      paramArrayOfObject.ai(5, this.vGx);
      paramArrayOfObject.iz(6, this.kdC);
      paramArrayOfObject.iz(7, this.vGr);
      if (this.title != null)
        paramArrayOfObject.e(8, this.title);
      paramArrayOfObject.iz(9, this.scene);
      paramArrayOfObject.iz(10, this.vFQ);
      paramArrayOfObject.iz(11, this.vFP);
      paramArrayOfObject.iz(12, this.vFO);
      if (this.session_id != null)
        paramArrayOfObject.e(13, this.session_id);
      AppMethodBeat.o(14700);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label934;
    label934: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.content != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.content);
      i = i + e.a.a.b.b.a.o(5, this.vGx) + e.a.a.b.b.a.bs(6, this.kdC) + e.a.a.b.b.a.bs(7, this.vGr);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.title);
      i = paramInt + e.a.a.b.b.a.bs(9, this.scene) + e.a.a.b.b.a.bs(10, this.vFQ) + e.a.a.b.b.a.bs(11, this.vFP) + e.a.a.b.b.a.bs(12, this.vFO);
      paramInt = i;
      if (this.session_id != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.session_id);
      AppMethodBeat.o(14700);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14700);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ep localep = (ep)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 3:
        default:
          AppMethodBeat.o(14700);
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
            localep.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 2:
          localep.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 4:
          localep.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 5:
          localep.vGx = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 6:
          localep.kdC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 7:
          localep.vGr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 8:
          localep.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 9:
          localep.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 10:
          localep.vFQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 11:
          localep.vFP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 12:
          localep.vFO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        case 13:
          localep.session_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14700);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14700);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ep
 * JD-Core Version:    0.6.2
 */