package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class avj extends bsr
{
  public String csB;
  public int kCo;
  public int scene;
  public String url;
  public String wzn;
  public String wzo;
  public int wzp;
  public int wzq;
  public String wzr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96250);
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
      if (this.wzn != null)
        paramArrayOfObject.e(3, this.wzn);
      paramArrayOfObject.iz(4, this.scene);
      if (this.url != null)
        paramArrayOfObject.e(5, this.url);
      if (this.wzo != null)
        paramArrayOfObject.e(6, this.wzo);
      paramArrayOfObject.iz(7, this.kCo);
      paramArrayOfObject.iz(8, this.wzp);
      paramArrayOfObject.iz(9, this.wzq);
      if (this.wzr != null)
        paramArrayOfObject.e(10, this.wzr);
      AppMethodBeat.o(96250);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label835;
    label835: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csB);
      i = paramInt;
      if (this.wzn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wzn);
      i += e.a.a.b.b.a.bs(4, this.scene);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.url);
      i = paramInt;
      if (this.wzo != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wzo);
      i = i + e.a.a.b.b.a.bs(7, this.kCo) + e.a.a.b.b.a.bs(8, this.wzp) + e.a.a.b.b.a.bs(9, this.wzq);
      paramInt = i;
      if (this.wzr != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wzr);
      AppMethodBeat.o(96250);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96250);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avj localavj = (avj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96250);
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
            localavj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 2:
          localavj.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 3:
          localavj.wzn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 4:
          localavj.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 5:
          localavj.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 6:
          localavj.wzo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 7:
          localavj.kCo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 8:
          localavj.wzp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 9:
          localavj.wzq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        case 10:
          localavj.wzr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96250);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96250);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avj
 * JD-Core Version:    0.6.2
 */