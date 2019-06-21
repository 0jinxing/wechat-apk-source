package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ckm extends bsr
{
  public int boZ;
  public int scene;
  public String session_id;
  public String username;
  public int vOO;
  public int xiq;
  public int xir;
  public int xis;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96304);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.scene);
      paramArrayOfObject.iz(3, this.xiq);
      paramArrayOfObject.iz(4, this.vOO);
      paramArrayOfObject.iz(5, this.xir);
      paramArrayOfObject.iz(6, this.xis);
      if (this.username != null)
        paramArrayOfObject.e(7, this.username);
      paramArrayOfObject.iz(8, this.boZ);
      if (this.session_id != null)
        paramArrayOfObject.e(9, this.session_id);
      AppMethodBeat.o(96304);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label732;
    label732: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.scene) + e.a.a.b.b.a.bs(3, this.xiq) + e.a.a.b.b.a.bs(4, this.vOO) + e.a.a.b.b.a.bs(5, this.xir) + e.a.a.b.b.a.bs(6, this.xis);
      paramInt = i;
      if (this.username != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.username);
      i = paramInt + e.a.a.b.b.a.bs(8, this.boZ);
      paramInt = i;
      if (this.session_id != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.session_id);
      AppMethodBeat.o(96304);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96304);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ckm localckm = (ckm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96304);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localckm.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 2:
          localckm.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 3:
          localckm.xiq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 4:
          localckm.vOO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 5:
          localckm.xir = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 6:
          localckm.xis = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 7:
          localckm.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 8:
          localckm.boZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        case 9:
          localckm.session_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96304);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96304);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckm
 * JD-Core Version:    0.6.2
 */