package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class EnterpriseFullHeightListView extends ListView
{
  private int itemHeight = 0;
  public boolean zuw = true;
  private View zux;

  public EnterpriseFullHeightListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public EnterpriseFullHeightListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  // ERROR //
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: ldc 27
    //   5: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: iload_1
    //   10: iload_2
    //   11: iload_3
    //   12: iload 4
    //   14: invokespecial 35	android/widget/ListView:onSizeChanged	(IIII)V
    //   17: aload_0
    //   18: getfield 16	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zuw	Z
    //   21: ifeq +9 -> 30
    //   24: ldc 27
    //   26: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: return
    //   30: aload_0
    //   31: getfield 16	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zuw	Z
    //   34: ifne +249 -> 283
    //   37: aload_0
    //   38: invokevirtual 42	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getHeaderViewsCount	()I
    //   41: istore 6
    //   43: aload_0
    //   44: invokevirtual 46	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getAdapter	()Landroid/widget/ListAdapter;
    //   47: invokeinterface 51 1 0
    //   52: istore 7
    //   54: iload 5
    //   56: istore 4
    //   58: iload 7
    //   60: istore_1
    //   61: iload 6
    //   63: istore_3
    //   64: aload_0
    //   65: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   68: ifnull +15 -> 83
    //   71: iload 7
    //   73: iconst_1
    //   74: isub
    //   75: istore_1
    //   76: iload 6
    //   78: istore_3
    //   79: iload 5
    //   81: istore 4
    //   83: iload_3
    //   84: iload_1
    //   85: if_icmpge +118 -> 203
    //   88: aload_0
    //   89: getfield 18	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:itemHeight	I
    //   92: istore 5
    //   94: iload 5
    //   96: ifgt +41 -> 137
    //   99: aload_0
    //   100: invokevirtual 46	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getAdapter	()Landroid/widget/ListAdapter;
    //   103: iload_3
    //   104: aconst_null
    //   105: aload_0
    //   106: invokeinterface 57 4 0
    //   111: astore 8
    //   113: aload 8
    //   115: iconst_0
    //   116: iconst_0
    //   117: invokestatic 63	android/view/View$MeasureSpec:makeMeasureSpec	(II)I
    //   120: iconst_0
    //   121: iconst_0
    //   122: invokestatic 63	android/view/View$MeasureSpec:makeMeasureSpec	(II)I
    //   125: invokevirtual 69	android/view/View:measure	(II)V
    //   128: aload_0
    //   129: aload 8
    //   131: invokevirtual 72	android/view/View:getMeasuredHeight	()I
    //   134: putfield 18	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:itemHeight	I
    //   137: iload 4
    //   139: aload_0
    //   140: getfield 18	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:itemHeight	I
    //   143: iadd
    //   144: istore 5
    //   146: iload 5
    //   148: istore 4
    //   150: iload 5
    //   152: iload_2
    //   153: if_icmple +44 -> 197
    //   156: aload_0
    //   157: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   160: ifnull +17 -> 177
    //   163: aload_0
    //   164: aload_0
    //   165: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   168: invokevirtual 76	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:removeFooterView	(Landroid/view/View;)Z
    //   171: pop
    //   172: aload_0
    //   173: aconst_null
    //   174: putfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   177: ldc 27
    //   179: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -153 -> 29
    //   185: astore 8
    //   187: ldc 27
    //   189: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: goto -163 -> 29
    //   195: astore 8
    //   197: iinc 3 1
    //   200: goto -117 -> 83
    //   203: iload 4
    //   205: iload_2
    //   206: if_icmpge +77 -> 283
    //   209: aload_0
    //   210: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   213: ifnonnull +23 -> 236
    //   216: new 65	android/view/View
    //   219: astore 8
    //   221: aload 8
    //   223: aload_0
    //   224: invokevirtual 80	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getContext	()Landroid/content/Context;
    //   227: invokespecial 83	android/view/View:<init>	(Landroid/content/Context;)V
    //   230: aload_0
    //   231: aload 8
    //   233: putfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   236: aload_0
    //   237: aload_0
    //   238: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   241: invokevirtual 76	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:removeFooterView	(Landroid/view/View;)Z
    //   244: pop
    //   245: aload_0
    //   246: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   249: astore 8
    //   251: new 85	android/widget/AbsListView$LayoutParams
    //   254: astore 9
    //   256: aload 9
    //   258: iconst_m1
    //   259: iload_2
    //   260: iload 4
    //   262: isub
    //   263: invokespecial 87	android/widget/AbsListView$LayoutParams:<init>	(II)V
    //   266: aload 8
    //   268: aload 9
    //   270: invokevirtual 91	android/view/View:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   273: aload_0
    //   274: aload_0
    //   275: getfield 53	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:zux	Landroid/view/View;
    //   278: aconst_null
    //   279: iconst_0
    //   280: invokevirtual 95	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:addFooterView	(Landroid/view/View;Ljava/lang/Object;Z)V
    //   283: ldc 27
    //   285: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   288: goto -259 -> 29
    //
    // Exception table:
    //   from	to	target	type
    //   30	54	185	java/lang/Exception
    //   64	71	185	java/lang/Exception
    //   88	94	185	java/lang/Exception
    //   137	146	185	java/lang/Exception
    //   156	177	185	java/lang/Exception
    //   177	182	185	java/lang/Exception
    //   209	236	185	java/lang/Exception
    //   236	283	185	java/lang/Exception
    //   99	137	195	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseFullHeightListView
 * JD-Core Version:    0.6.2
 */