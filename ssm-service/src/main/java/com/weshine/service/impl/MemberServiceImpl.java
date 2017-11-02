package com.weshine.service.impl;

import com.weshine.model.Member;
import com.weshine.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/2
 */
@Service("memberService")
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl extends BaseServiceImpl<Member> implements MemberService{

}
