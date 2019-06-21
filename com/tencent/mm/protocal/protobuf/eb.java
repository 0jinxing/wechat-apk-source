package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class eb extends bsr
{
  public String session_id;
  public String url;
  public LinkedList<to> vFN;
  public int vFO;
  public int vFP;

  public eb()
  {
    AppMethodBeat.i(14683);
    this.vFN = new LinkedList();
    AppMethodBeat.o(14683);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14684);
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
      paramArrayOfObject.e(4, 8, this.vFN);
      if (this.session_id != null)
        paramArrayOfObject.e(5, this.session_id);
      paramArrayOfObject.iz(6, this.vFO);
      paramArrayOfObject.iz(7, this.vFP);
      AppMethodBeat.o(14684);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label708;
    label708: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.url);
      i += e.a.a.a.c(4, 8, this.vFN);
      paramInt = i;
      if (this.session_id != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.session_id);
      paramInt = paramInt + e.a.a.b.b.a.bs(6, this.vFO) + e.a.a.b.b.a.bs(7, this.vFP);
      AppMethodBeat.o(14684);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vFN.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14684);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        eb localeb = (eb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 3:
        default:
          AppMethodBeat.o(14684);
          paramInt = -1;
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
            localeb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(14684);
          paramInt = i;
          break;
        case 2:
          localeb.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14684);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new to();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((to)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localeb.vFN.add(localObject1);
          }
          AppMethodBeat.o(14684);
          paramInt = i;
          break;
        case 5:
          localeb.session_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14684);
          paramInt = i;
          break;
        case 6:
          localeb.vFO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14684);
          paramInt = i;
          break;
        case 7:
          localeb.vFP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14684);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(14684);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.eb
 * JD-Core Version:    0.6.2
 */