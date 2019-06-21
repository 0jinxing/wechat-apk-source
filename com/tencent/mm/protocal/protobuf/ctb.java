package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ctb extends bsr
{
  public String csB;
  public int id;
  public String query;
  public LinkedList<Integer> xqi;

  public ctb()
  {
    AppMethodBeat.i(93816);
    this.xqi = new LinkedList();
    AppMethodBeat.o(93816);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93817);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      paramArrayOfObject.iz(3, this.id);
      paramArrayOfObject.e(4, 2, this.xqi);
      if (this.query != null)
        paramArrayOfObject.e(5, this.query);
      AppMethodBeat.o(93817);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label562;
    label562: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      i = i + e.a.a.b.b.a.bs(3, this.id) + e.a.a.a.c(4, 2, this.xqi);
      paramInt = i;
      if (this.query != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.query);
      AppMethodBeat.o(93817);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xqi.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93817);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ctb localctb = (ctb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93817);
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
            localctb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(93817);
          paramInt = i;
          break;
        case 2:
          localctb.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93817);
          paramInt = i;
          break;
        case 3:
          localctb.id = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93817);
          paramInt = i;
          break;
        case 4:
          localctb.xqi.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(93817);
          paramInt = i;
          break;
        case 5:
          localctb.query = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93817);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93817);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctb
 * JD-Core Version:    0.6.2
 */