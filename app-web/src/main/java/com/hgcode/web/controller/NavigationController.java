package com.hgcode.web.controller;

import com.hgcode.web.support.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wentao on 2016/12/25.
 */
@RestController
public class NavigationController {

    @RequestMapping("/navigation")
    public List<Menu> initNavigation(){

        return null;
    }

}
