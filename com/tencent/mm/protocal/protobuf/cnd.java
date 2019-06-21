package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnd extends bsr
{
  public String csB;
  public String cxb;
  public String pbn;
  public String tCi;
  public String vId;
  public LinkedList<Integer> wXf;
  public String wXg;
  public String wXi;

  public cnd()
  {
    AppMethodBeat.i(96312);
    this.wXf = new LinkedList();
    AppMethodBeat.o(96312);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96313);
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
      paramArrayOfObject.e(3, 2, this.wXf);
      if (this.wXg != null)
        paramArrayOfObject.e(4, this.wXg);
      if (this.vId != null)
        paramArrayOfObject.e(5, this.vId);
      if (this.cxb != null)
        paramArrayOfObject.e(6, this.cxb);
      if (this.tCi != null)
        paramArrayOfObject.e(7, this.tCi);
      if (this.wXi != null)
        paramArrayOfObject.e(8, this.wXi);
      if (this.pbn != null)
        paramArrayOfObject.e(9, this.pbn);
      AppMethodBeat.o(96313);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label842;
    label842: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      i += e.a.a.a.c(3, 2, this.wXf);
      paramInt = i;
      if (this.wXg != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wXg);
      i = paramInt;
      if (this.vId != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vId);
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.cxb);
      i = paramInt;
      if (this.tCi != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.tCi);
      paramInt = i;
      if (this.wXi != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wXi);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.pbn);
      AppMethodBeat.o(96313);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wXf.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96313);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnd localcnd = (cnd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96313);
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
            localcnd.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 2:
          localcnd.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 3:
          localcnd.wXf.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 4:
          localcnd.wXg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 5:
          localcnd.vId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 6:
          localcnd.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 7:
          localcnd.tCi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 8:
          localcnd.wXi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        case 9:
          localcnd.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96313);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96313);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnd
 * JD-Core Version:    0.6.2
 */