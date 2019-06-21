package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class p extends bsr
{
  public String pQe;
  public int scene;
  public long vAe;
  public String vAg;
  public String vzL;
  public String vzM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56684);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vzL != null)
        paramArrayOfObject.e(2, this.vzL);
      paramArrayOfObject.ai(3, this.vAe);
      paramArrayOfObject.iz(4, this.scene);
      if (this.vzM != null)
        paramArrayOfObject.e(5, this.vzM);
      if (this.vAg != null)
        paramArrayOfObject.e(6, this.vAg);
      if (this.pQe != null)
        paramArrayOfObject.e(7, this.pQe);
      AppMethodBeat.o(56684);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label673;
    label673: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vzL != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vzL);
      i = i + e.a.a.b.b.a.o(3, this.vAe) + e.a.a.b.b.a.bs(4, this.scene);
      paramInt = i;
      if (this.vzM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vzM);
      i = paramInt;
      if (this.vAg != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vAg);
      paramInt = i;
      if (this.pQe != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pQe);
      AppMethodBeat.o(56684);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56684);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        p localp = (p)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56684);
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
            localp.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        case 2:
          localp.vzL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        case 3:
          localp.vAe = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        case 4:
          localp.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        case 5:
          localp.vzM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        case 6:
          localp.vAg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        case 7:
          localp.pQe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56684);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56684);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.p
 * JD-Core Version:    0.6.2
 */