package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bvz extends bsr
{
  public String csB;
  public int cvd;
  public int scene;
  public String url;
  public int vOP;
  public String vTT;
  public String wWO;
  public String wap;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56967);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wap != null)
        paramArrayOfObject.e(2, this.wap);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      if (this.wWO != null)
        paramArrayOfObject.e(5, this.wWO);
      paramArrayOfObject.iz(6, this.scene);
      paramArrayOfObject.iz(7, this.cvd);
      if (this.vTT != null)
        paramArrayOfObject.e(8, this.vTT);
      paramArrayOfObject.iz(9, this.vOP);
      AppMethodBeat.o(56967);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label788;
    label788: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wap != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wap);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.csB);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.url);
      i = paramInt;
      if (this.wWO != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wWO);
      i = i + e.a.a.b.b.a.bs(6, this.scene) + e.a.a.b.b.a.bs(7, this.cvd);
      paramInt = i;
      if (this.vTT != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vTT);
      paramInt += e.a.a.b.b.a.bs(9, this.vOP);
      AppMethodBeat.o(56967);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56967);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvz localbvz = (bvz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56967);
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
            localbvz.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 2:
          localbvz.wap = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 3:
          localbvz.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 4:
          localbvz.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 5:
          localbvz.wWO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 6:
          localbvz.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 7:
          localbvz.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 8:
          localbvz.vTT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        case 9:
          localbvz.vOP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56967);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56967);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvz
 * JD-Core Version:    0.6.2
 */